package com.sun.hitect.shooping_cart.dto;

import java.util.Date;

public class orderDTO {
	private int order_id;
	private String order_name;
	private String order_product;
	private String order_persion;
	private double order_price;
	private Date order_date;
	private Date order_deleverd;
	private String order_person_contect;
	private String order_address;
	private String order_bill_address;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getOrder_product() {
		return order_product;
	}
	public void setOrder_product(String order_product) {
		this.order_product = order_product;
	}
	public String getOrder_persion() {
		return order_persion;
	}
	public void setOrder_persion(String order_persion) {
		this.order_persion = order_persion;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double d) {
		this.order_price = d;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getOrder_deleverd() {
		return order_deleverd;
	}
	public void setOrder_deleverd(Date order_deleverd) {
		this.order_deleverd = order_deleverd;
	}
	public String getOrder_person_contect() {
		return order_person_contect;
	}
	public void setOrder_person_contect(String order_person_contect) {
		this.order_person_contect = order_person_contect;
	}
	public String getOrder_address() {
		return order_address;
	}
	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}
	public String getOrder_bill_address() {
		return order_bill_address;
	}
	public void setOrder_bill_address(String order_bill_address) {
		this.order_bill_address = order_bill_address;
	}
}
