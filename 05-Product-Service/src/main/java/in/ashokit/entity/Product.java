package in.ashokit.entity;



import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productId;
	private String name;
	private String desc;
	private Double price;
	private Integer stock;
	private String image;
	private Integer dicount;
	private Double priceBeforeDiscount;
	@CreationTimestamp
	@Column(name="create_dt", updatable=false)
	private LocalDate createddate;
	@Column(name="update_dt",insertable=false)
	private LocalDate updatedDate; 
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private Category category;
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
	public LocalDate getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	}
