package org.okasha.model;

public class Order {
private String OrderID, Payment_Method, Delivery_Address, OrderStatus, Date;

public String getOrderID() {
	return OrderID;
}

public void setOrderID(String orderID) {
	OrderID = orderID;
}

public String getPayment_Method() {
	return Payment_Method;
}

public void setPayment_Method(String payment_Method) {
	Payment_Method = payment_Method;
}

public String getDelivery_Address() {
	return Delivery_Address;
}

public void setDelivery_Address(String delivery_Address) {
	Delivery_Address = delivery_Address;
}

public String getOrderStatus() {
	return OrderStatus;
}

public void setOrderStatus(String orderStatus) {
	OrderStatus = orderStatus;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

}
