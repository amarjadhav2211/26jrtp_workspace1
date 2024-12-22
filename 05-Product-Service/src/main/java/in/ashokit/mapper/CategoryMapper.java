package in.ashokit.mapper;

import org.modelmapper.ModelMapper;

import in.ashokit.dto.CategoryDto;
import in.ashokit.entity.Category;

public class CategoryMapper {
	
	private static final ModelMapper mapper=new ModelMapper();
	
	public static Category convertToEntity(CategoryDto categoryDto)
	{
		return mapper.map(categoryDto, Category.class);
	}
	
	public static CategoryDto convertToDto(Category category)
	{
		return mapper.map(category, CategoryDto.class);
	}

}
