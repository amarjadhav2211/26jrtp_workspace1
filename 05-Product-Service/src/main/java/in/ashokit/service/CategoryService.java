package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dto.CategoryDto;
import in.ashokit.repo.CategoryRepo;

@Service
public interface CategoryService {
	public CategoryDto addCategory(CategoryDto categoryDto);
	public CategoryDto updateCategoryById(Integer categoryId,CategoryDto categoryDto);
	public List<CategoryDto> getAllCategories();
	public CategoryDto getCategoryById(Integer categoryId);
	public CategoryDto deleteCategoryById(Integer categoryId);
	
}
