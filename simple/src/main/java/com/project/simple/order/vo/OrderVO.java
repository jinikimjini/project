package com.project.simple.order.vo;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

import org.springframework.stereotype.Component;


@Component("orderVO")

public class OrderVO {
	//주문페이지
	private String memId;
	private String productNum;
	private String productName;
	private int productCnt;
	private int productPrice;
	private String memName;
	private String memAdr;
	private String memPhoneNum;
	private String memSpName;
	private String memSpPhoneNum1;
	private String memSpPhoneNum2;
	private int memCartId;

	private String memOrderMsg;
	private int memOrderNum;
	private String memDepositorName;
	private String memPaymentMethod;
	private String option1value;
	private String option2value;
	private String memOrderDate;
	
	private String option1name;
	private String option2name;
	private int totalPrice;

	private String productimage;
	private String purchaseConfirm;
	private String returnConfirm;
	private String reviewConfirm;
	private String deliverycharge;
	
	private String memSpPhoneNum1_0;
	private String memSpPhoneNum1_1;
	private String memSpPhoneNum1_2;
	
	private String memSpPhoneNum2_0;
	private String memSpPhoneNum2_1;
	private String memSpPhoneNum2_2;
	
	private String memSpAdr;
	private String memSpAdr1;
	private String memSpAdr2;
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCnt() {
		return productCnt;
	}
	public void setProductCnt(int productCnt) {
		this.productCnt = productCnt;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemAdr() {
		return memAdr;
	}
	public void setMemAdr(String memAdr) {
		this.memAdr = memAdr;
	}
	public String getMemPhoneNum() {
		return memPhoneNum;
	}
	public void setMemPhoneNum(String memPhoneNum) {
		this.memPhoneNum = memPhoneNum;
	}
	public String getMemSpName() {
		return memSpName;
	}
	public void setMemSpName(String memSpName) {
		this.memSpName = memSpName;
	}
	public String getMemSpPhoneNum1() {
		return memSpPhoneNum1;
	}
	public void setMemSpPhoneNum1(String memSpPhoneNum1) {
		this.memSpPhoneNum1 = memSpPhoneNum1;
	}
	public String getMemSpPhoneNum2() {
		return memSpPhoneNum2;
	}
	public void setMemSpPhoneNum2(String memSpPhoneNum2) {
		this.memSpPhoneNum2 = memSpPhoneNum2;
	}
	public int getMemCartId() {
		return memCartId;
	}
	public void setMemCartId(int memCartId) {
		this.memCartId = memCartId;
	}
	public String getMemOrderMsg() {
		return memOrderMsg;
	}
	public void setMemOrderMsg(String memOrderMsg) {
		this.memOrderMsg = memOrderMsg;
	}
	public int getMemOrderNum() {
		return memOrderNum;
	}
	public void setMemOrderNum(int memOrderNum) {
		this.memOrderNum = memOrderNum;
	}
	public String getMemDepositorName() {
		return memDepositorName;
	}
	public void setMemDepositorName(String memDepositorName) {
		this.memDepositorName = memDepositorName;
	}
	public String getMemPaymentMethod() {
		return memPaymentMethod;
	}
	public void setMemPaymentMethod(String memPaymentMethod) {
		this.memPaymentMethod = memPaymentMethod;
	}
	public String getOption1value() {
		return option1value;
	}
	public void setOption1value(String option1value) {
		this.option1value = option1value;
	}
	public String getOption2value() {
		return option2value;
	}
	public void setOption2value(String option2value) {
		this.option2value = option2value;
	}
	public String getMemOrderDate() {
		return memOrderDate;
	}
	public void setMemOrderDate(String memOrderDate) {
		this.memOrderDate = memOrderDate;
	}
	public String getOption1name() {
		return option1name;
	}
	public void setOption1name(String option1name) {
		this.option1name = option1name;
	}
	public String getOption2name() {
		return option2name;
	}
	public void setOption2name(String option2name) {
		this.option2name = option2name;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getProductimage() {
		return productimage;
	}
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	public String getPurchaseConfirm() {
		return purchaseConfirm;
	}
	public void setPurchaseConfirm(String purchaseConfirm) {
		this.purchaseConfirm = purchaseConfirm;
	}
	public String getReturnConfirm() {
		return returnConfirm;
	}
	public void setReturnConfirm(String returnConfirm) {
		this.returnConfirm = returnConfirm;
	}
	public String getReviewConfirm() {
		return reviewConfirm;
	}
	public void setReviewConfirm(String reviewConfirm) {
		this.reviewConfirm = reviewConfirm;
	}
	public String getDeliverycharge() {
		return deliverycharge;
	}
	public void setDeliverycharge(String deliverycharge) {
		this.deliverycharge = deliverycharge;
	}
	
	public String getMemSpPhoneNum1_0() {
		return memSpPhoneNum1_0;
	}
	public void setMemSpPhoneNum1_0(String memSpPhoneNum1_0) {
		this.memSpPhoneNum1_0 = memSpPhoneNum1_0;
	}
	public String getMemSpPhoneNum1_1() {
		return memSpPhoneNum1_1;
	}
	public void setMemSpPhoneNum1_1(String memSpPhoneNum1_1) {
		this.memSpPhoneNum1_1 = memSpPhoneNum1_1;
	}
	public String getMemSpPhoneNum1_2() {
		return memSpPhoneNum1_2;
	}
	public void setMemSpPhoneNum1_2(String memSpPhoneNum1_2) {
		this.memSpPhoneNum1_2 = memSpPhoneNum1_2;
	}
	public String getMemSpPhoneNum2_0() {
		return memSpPhoneNum2_0;
	}
	public void setMemSpPhoneNum2_0(String memSpPhoneNum2_0) {
		this.memSpPhoneNum2_0 = memSpPhoneNum2_0;
	}
	public String getMemSpPhoneNum2_1() {
		return memSpPhoneNum2_1;
	}
	public void setMemSpPhoneNum2_1(String memSpPhoneNum2_1) {
		this.memSpPhoneNum2_1 = memSpPhoneNum2_1;
	}
	public String getMemSpPhoneNum2_2() {
		return memSpPhoneNum2_2;
	}
	public void setMemSpPhoneNum2_2(String memSpPhoneNum2_2) {
		this.memSpPhoneNum2_2 = memSpPhoneNum2_2;
	}
	public String getMemSpAdr() {
		return memSpAdr;
	}
	public void setMemSpAdr(String memSpAdr) {
		this.memSpAdr = memSpAdr;
	}
	public String getMemSpAdr1() {
		return memSpAdr1;
	}
	public void setMemSpAdr1(String memSpAdr1) {
		this.memSpAdr1 = memSpAdr1;
	}
	public String getMemSpAdr2() {
		return memSpAdr2;
	}
	public void setMemSpAdr2(String memSpAdr2) {
		this.memSpAdr2 = memSpAdr2;
	}
	
	

	
	

	
	
}

