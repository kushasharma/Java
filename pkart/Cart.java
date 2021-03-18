package com.model.ekart;

public class Cart {
	
 int customerId;
 String productName;
 float price;
 int qantity;
 
 public Cart() {
	 
 }
public Cart(int customerId, String productName, float price, int qantity) {
	super();
	this.customerId = customerId;
	this.productName = productName;
	this.price = price;
	this.qantity = quantity;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQantty() {
	return qantity;
}
public void setQantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Cart [CustId=" + getCustomerId() + ", ProductName=" + getProductName() + ", Price=" + getPrice()
			+ ", Qty=" + getQuantity() + "]";
}
}
