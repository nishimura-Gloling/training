package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// テーブルとマッピングを行うオブジェクト(Entity)であることを明示
@Entity
// 対応するテーブル名を明示
@Table(name = "products")
@Data
public class Product  implements Serializable {

	// 主 Fキーに付加
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private int price;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price ;
	}
}