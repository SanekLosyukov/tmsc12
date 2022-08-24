package by.teachmeskills.eshop.services.impl;

import by.teachmeskills.eshop.dto.CategoryDto;
import by.teachmeskills.eshop.dto.converters.CategoryConverter;
import by.teachmeskills.eshop.entities.Category;
import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.CategoryRepository;
import by.teachmeskills.eshop.services.CategoryService;
import by.teachmeskills.eshop.services.ProductService;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static by.teachmeskills.eshop.PagesPathEnum.CATEGORY_PAGE;
import static by.teachmeskills.eshop.PagesPathEnum.START_PAGE;
import static by.teachmeskills.eshop.RequestParamsEnum.CATEGORY_PARAM;
import static by.teachmeskills.eshop.RequestParamsEnum.POPULAR_CATEGORIES_LIST_REQ_PARAM;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ProductService productService;
    private final CategoryConverter categoryConverter;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ProductService productService, CategoryConverter categoryConverter) {
        this.categoryRepository = categoryRepository;
        this.productService = productService;
        this.categoryConverter = categoryConverter;
    }

    @Override
    public ModelAndView getCategoryData(int id) throws Exception {
        ModelMap model = new ModelMap();

        Category category = categoryRepository.findById(id);
        if (Optional.ofNullable(category).isPresent()) {
            List<Product> products = productService.getAllForCategory(category.getId());
            category.setProductList(products);
            model.addAttribute(CATEGORY_PARAM.getValue(), category);
        }

        return new ModelAndView(CATEGORY_PAGE.getPath(), model);
    }

    @Override
    public ModelAndView completeAllHomePageData() throws Exception {
        ModelMap model = new ModelMap();
        List<Category> categoriesList = read();
        model.addAttribute(POPULAR_CATEGORIES_LIST_REQ_PARAM.getValue(), categoriesList);
        return new ModelAndView(START_PAGE.getPath(), model);
    }

    @Override
    public List<Category> read() throws Exception {
        return categoryRepository.findAll();
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(categoryConverter::toDto).toList();
    }

    @Override
    public CategoryDto getCertainCategory(int id) throws Exception {
        return categoryConverter.toDto(categoryRepository.findById(id));
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        try {
            Category category = categoryConverter.fromDto(categoryDto);
            category = categoryRepository.createCategory(category);
            return categoryConverter.toDto(category);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<CategoryDto> saveCategoriesFromFile(MultipartFile file) {
        List<CategoryDto> csvCategories = parseCsv(file);
        List<Category> categories = Optional.ofNullable(csvCategories)
                .map(list -> list.stream()
                        .map(categoryConverter::fromDto)
                        .toList())
                .orElse(null);
        if (Optional.ofNullable(categories).isPresent()) {
            categories.forEach(categoryRepository::createCategory);
            return csvCategories;
        }
        return Collections.emptyList();
    }

    private List<CategoryDto> parseCsv(MultipartFile file) {
        if (Optional.ofNullable(file).isPresent()) {
            try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
                CsvToBean<CategoryDto> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(CategoryDto.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .withSeparator(',')
                        .build();

                return csvToBean.parse();
            } catch (Exception ex) {
                log.error("Exception occurred during CSV parsing: {}", ex.getMessage());
            }
        } else {
            log.error("Empty CSV file is uploaded.");
        }
        return Collections.emptyList();
    }
}
