package com.training.dto;

import java.time.LocalDateTime;
import java.util.List;

public class UserOrdersResponse {

	private int userId;

	private List<UserOrders> userOrders;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;

	private Boolean isActive;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<UserOrders> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(List<UserOrders> userOrders) {
		this.userOrders = userOrders;
	}

}
