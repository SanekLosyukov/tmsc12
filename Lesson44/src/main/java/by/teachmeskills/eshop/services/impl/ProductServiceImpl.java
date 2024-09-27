package by.teachmeskills.eshop.services.impl;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ImageRepository;
import by.teachmeskills.eshop.repositories.ProductRepository;
import by.teachmeskills.eshop.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import static by.teachmeskills.eshop.PagesPathEnum.PRODUCT_PAGE;
import static by.teachmeskills.eshop.PagesPathEnum.SEARCH_PAGE;
import static by.teachmeskills.eshop.RequestParamsEnum.PRODUCT;
import static by.teachmeskills.eshop.RequestParamsEnum.SEARCHED_PRODUCTS;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ImageRepository imageRepository;

    public ProductServiceImpl(ProductRepository productRepository, ImageRepository imageRepository) {
        this.productRepository = productRepository;
        this.imageRepository = imageRepository;
    }

    @Override
    public List<Product> getAllForCategory(int categoryId) throws Exception {
        return productRepository.findByAllCategoryId(categoryId);
    }

    @Override
    public ModelAndView getProductData(int id) throws Exception {
        ModelMap model = new ModelMap();
        Product product = productRepository.findById(id);
        if (Optional.ofNullable(product).isPresent()) {
            model.addAttribute(PRODUCT.getValue(), product);
        }
        return new ModelAndView(PRODUCT_PAGE.getPath(), model);
    }

    @Override
    public ModelAndView searchProduct(String search) throws Exception {
        ModelMap modelSearch = new ModelMap();
        List<Product> searchedProducts = productRepository.getSearchFromDB(search);
        if (Optional.ofNullable(searchedProducts).isPresent()) {
            modelSearch.addAttribute(SEARCHED_PRODUCTS.getValue(), searchedProducts);
        }
        return new ModelAndView(SEARCH_PAGE.getPath(), modelSearch);
    }

    @Override
    public List<Product> read() {
        return null;
    }
}
