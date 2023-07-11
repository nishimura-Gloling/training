package com.example.demo.dto;

import java.io.Serializable;

import org.springframework.format.annotation.NumberFormat;

import jakarta.validation.constraints.NotEmpty;

import jakarta.validation.constraints.Size;

public class ProductRequest implements Serializable {

	private int id;

	@NotEmpty(message = "商品名を入力してください")
	@Size(max = 50, message = "商品名は50桁以内で入力してください")
	private String name;

	@NotEmpty(message = "値段を入れてください")
	@NumberFormat
	private String price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}