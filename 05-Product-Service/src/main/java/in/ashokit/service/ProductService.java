package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.dto.ProductDto;

@Service
public interface ProductService {
		public ProductDto addProduct(ProductDto productDto,MultipartFile file);
		public ProductDto updateProduct(Integer productId,ProductDto productDto,MultipartFile file);
		public List<ProductDto> getAllProducts();
		public ProductDto deleteProductById(Integer productId);
		public ProductDto getProductById(Integer productId);
		public boolean updateStock(Integer productId,Integer quantity);
}
