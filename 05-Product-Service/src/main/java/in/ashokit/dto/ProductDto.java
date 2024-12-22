package in.ashokit.dto;

import in.ashokit.entity.Category;

public class ProductDto {
	
	private Integer productId;
	private String name;
	private String desc;
	private Double price;
	private Integer stock;
	private String image;
	private Integer dicount;
	private Double priceBeforeDiscount;
	private Integer categoryId;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getDicount() {
		return dicount;
	}
	public void setDicount(Integer dicount) {
		this.dicount = dicount;
	}
	public Double getPriceBeforeDiscount() {
		return priceBeforeDiscount;
	}
	public void setPriceBeforeDiscount(Double priceBeforeDiscount) {
		this.priceBeforeDiscount = priceBeforeDiscount;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	 
}
