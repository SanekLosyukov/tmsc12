package by.teachmeskills.eshop.dto.converters;

import by.teachmeskills.eshop.dto.ProductDto;
import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.CategoryRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    private final CategoryRepository categoryRepository;

    public ProductConverter(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ProductDto toDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .categoryId(product.getCategory().getId())
                .build();
    }

    public Product fromDto(ProductDto productDto) throws Exception {
        return Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .mainImage("/images/iphone11.jpg")
                .category(categoryRepository.findById(productDto.getCategoryId()))
                .build();
    }
}
