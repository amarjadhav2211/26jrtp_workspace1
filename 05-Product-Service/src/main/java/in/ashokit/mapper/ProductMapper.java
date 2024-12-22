package in.ashokit.mapper;

import org.modelmapper.ModelMapper;

import in.ashokit.dto.ProductDto;
import in.ashokit.entity.Product;

public class ProductMapper {
	
	private static final ModelMapper mapper=new ModelMapper();
			public static Product ConvertToEntity(ProductDto productDto)
			{
				return mapper.map(productDto, Product.class);
			}
			public static ProductDto convertToDto(Product product)
			{
				return mapper.map(product, ProductDto.class);
			}
}
