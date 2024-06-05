package com.training.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderid")
	private int orderId;

	@Column(name = "userid")
	private int userId;

	@Column(name = "totalorderprice")
	private float totalOrderPrice;

	@Column(name = "createddate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
	private LocalDateTime createdDate;

	@Column(name = "updateddate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
	private LocalDateTime updatedDate;

	@Column(name = "orderstatus", nullable = false)
	private String orderStatus;

	@OneToMany(mappedBy = "userOrder", cascade = CascadeType.ALL)
	private List<ProductsOrdered> orderedProducts;

	public Orders() {
		super();
		this.createdDate = LocalDateTime.now();
		this.updatedDate = LocalDateTime.now();
		this.orderStatus = "Inprogress";
	}

	public Orders(int orderId, int userId, float totalOrderPrice) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.totalOrderPrice = totalOrderPrice;
		this.createdDate = LocalDateTime.now();
		this.updatedDate = LocalDateTime.now();
		this.orderStatus = "Inprogress";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(float totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
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

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<ProductsOrdered> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(List<ProductsOrdered> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}

}
