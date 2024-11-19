package com.learn.Ecommerce.entity;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Table(name= "product_deatil") table name chnge krne keliye/will help to chnge table name
//@Table(name= "table_deatil") 

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {
	@Id
	private int productId;
	
	@Column(nullable=false)
	private String productName;
	
	@Column(name="description", nullable=false)
	private String productDescription;
	
	@Column(nullable=false)
	private int productPrice;
	

}
