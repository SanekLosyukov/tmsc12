package by.teachmeskills.eshop.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private int id;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private int rating;
    private List<ProductDto> products;
}
