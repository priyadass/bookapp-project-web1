package com.priya.user;

import java.time.LocalDate;

public class BookOrder {
	private Integer id;
	private Integer userId;
	private Integer booksId;
	private String Status;
	private Integer Quantity;
	private LocalDate orderDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBooksId() {
		return booksId;
	}
	public void setBooksId(Integer booksId) {
		this.booksId = booksId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public LocalDate getOrderdate() {
		return orderDate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderDate = orderdate;
	}
	@Override
	public String toString() {
		return "BookOrder [id=" + id + ", userId=" + userId + ", booksId=" + booksId + ", Status=" + Status
				+ ", Quantity=" + Quantity + ", orderdate=" + orderDate + "]";
	}

}
