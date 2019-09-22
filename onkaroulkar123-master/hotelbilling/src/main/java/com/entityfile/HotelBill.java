package com.entityfile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HotelBill")
public class HotelBill {
	@Id
	@Column

		private int itemCode;
	@Column
		private String foodName;
	@Column
		private double price;
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
