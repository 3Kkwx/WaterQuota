package com.water.quato.bean;

import java.util.Date;

/**
 * customer 客户信息表
 * @author QvQ
 *
 */
public class Customer {

	/**
	 * id,自增长
	 */
	private int customerId;
	
	/**
	 * customer_No,客户编号
	 */
	private String customer_No;
	
	/**
	 * customer_Name,客户姓名
	 */
	private String customerName;
	
	/**
	 * customer_Name,公司地址
	 */
	private String customerAddress;
	
	/**
	 * 公司性质
	 */
	private String customerType;
	
	/**
	 * 联系人
	 */
	private String customerContact;
	
	/**
	 * 公司电话
	 */
	private String customerPhone1;
	
	/**
	 * 公司电话
	 */
	private String customerPhone2;
	
	/**
	 * 邮箱
	 */
	private String customerEmail;
	
	/**
	 * 备注信息
	 */
	private String CustomerMemo;
	
	/**
	 * 编辑时间
	 */
	private Date editDate;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 标识位，1代表评估方，2代表用户自测
	 */
	private String Label;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomer_No() {
		return customer_No;
	}

	public void setCustomer_No(String customer_No) {
		this.customer_No = customer_No;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerPhone1() {
		return customerPhone1;
	}

	public void setCustomerPhone1(String customerPhone1) {
		this.customerPhone1 = customerPhone1;
	}

	public String getCustomerPhone2() {
		return customerPhone2;
	}

	public void setCustomerPhone2(String customerPhone2) {
		this.customerPhone2 = customerPhone2;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMemo() {
		return CustomerMemo;
	}

	public void setCustomerMemo(String customerMemo) {
		CustomerMemo = customerMemo;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customer_No=" + customer_No + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", customerType=" + customerType + ", customerContact="
				+ customerContact + ", customerPhone1=" + customerPhone1 + ", customerPhone2=" + customerPhone2
				+ ", customerEmail=" + customerEmail + ", CustomerMemo=" + CustomerMemo + ", editDate=" + editDate
				+ ", userName=" + userName + ", Label=" + Label + "]";
	}


	
}
