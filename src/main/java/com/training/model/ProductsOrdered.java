package com.training.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products_ordered")
public class ProductsOrdered {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "productid", nullable = false)
	private int productId;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Orders.class)
	@JoinColumn(name = "orderid", referencedColumnName = "orderid")
	private Orders userOrder;

	@Column(name = "createddate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
	private LocalDateTime createdDate;

	@Column(name = "updateddate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
	private LocalDateTime updatedDate;

	@Column(name = "productstatus", nullable = false)
	private String productStatus;

//	@ManyToOne
//	private Products products;

	public ProductsOrdered() {
		super();
		this.createdDate = LocalDateTime.now();
		this.updatedDate = LocalDateTime.now();
	}

	public ProductsOrdered(int id, int productId, Orders userOrder) {
		super();
		this.id = id;
		this.productId = productId;
		this.userOrder = userOrder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Orders getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(Orders userOrder) {
		this.userOrder = userOrder;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

//	public Products getProducts() {
//		return products;
//	}
//
//	public void setProducts(Products products) {
//		this.products = products;
//	}

}
