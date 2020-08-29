package com.itbank.vo;

public class NotMemberOrderListVO {
	
	//2020.08.28
	//비회원 VO 추가
	private int orderCode;
	private String merchanCode;
	private String orderDate;
	private int orderPrice;
	private int orderQuantity;
	private String orderAddress;
	private String orderCodename;
	private String orderNotes;
	private String orderPayoption;	// 결제방법
	private String orderRecieveName;
	private String orderRecievePnum;
	private String orderRecieveEmail;
	private int shoeSize;
	private String orderMerchanName;
	
	public int getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}
	public String getMerchanCode() {
		return merchanCode;
	}
	public void setMerchanCode(String merchanCode) {
		this.merchanCode = merchanCode;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderCodename() {
		return orderCodename;
	}
	public void setOrderCodename(String orderCodename) {
		this.orderCodename = orderCodename;
	}
	public String getOrderNotes() {
		return orderNotes;
	}
	public void setOrderNotes(String orderNotes) {
		this.orderNotes = orderNotes;
	}
	public String getOrderPayoption() {
		return orderPayoption;
	}
	public void setOrderPayoption(String orderPayoption) {
		this.orderPayoption = orderPayoption;
	}
	public String getOrderRecieveName() {
		return orderRecieveName;
	}
	public void setOrderRecieveName(String orderRecieveName) {
		this.orderRecieveName = orderRecieveName;
	}
	public String getOrderRecievePnum() {
		return orderRecievePnum;
	}
	public void setOrderRecievePnum(String orderRecievePnum) {
		this.orderRecievePnum = orderRecievePnum;
	}
	public String getOrderRecieveEmail() {
		return orderRecieveEmail;
	}
	public void setOrderRecieveEmail(String orderRecieveEmail) {
		this.orderRecieveEmail = orderRecieveEmail;
	}
	public int getShoeSize() {
		return shoeSize;
	}
	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}
	public String getOrderMerchanName() {
		return orderMerchanName;
	}
	public void setOrderMerchanName(String orderMerchanName) {
		this.orderMerchanName = orderMerchanName;
	}
	
}
