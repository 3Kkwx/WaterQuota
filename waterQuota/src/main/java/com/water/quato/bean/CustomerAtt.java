package com.water.quato.bean;

public class CustomerAtt {

	/**
	 * id.
	 */
	private int customerAttId;
	
	/**
	 * 客户编号
	 */
	private String customerNo;	
	
	/**
	 * 用水定额编号
	 */
	private String waterQuotaNo;
	
	/**
	 * 用水类型编号
	 */
	private String waterUseNo;
	
	/**
	 * 用水类性指标(仅自定义用水类型)
	 */
	private float waterUseQty;
	
	/**
	 * 用水参数值1
	 */
	private String customerAttCqty1;
	
	/**
	 * 用水参数值2
	 */
	private String customerAttCqty2;
	
	/**
	 * 用水参数值3
	 */
	private String customerAttCqty3;
	
	/**
	 * 用水参数值4
	 */
	private String customerAttCqty4;
	
	/**
	 * 用水参数值5
	 */
	private String customerAttCqty5;
	
	/**
	 * 用水参数值6
	 */
	private String customerAttCqty6;
	
	/**
	 * 备注信息
	 */
	private String customerAttMemo;

	public int getCustomerAttId() {
		return customerAttId;
	}

	public void setCustomerAttId(int customerAttId) {
		this.customerAttId = customerAttId;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getWaterQuotaNo() {
		return waterQuotaNo;
	}

	public void setWaterQuotaNo(String waterQuotaNo) {
		this.waterQuotaNo = waterQuotaNo;
	}

	public String getWaterUseNo() {
		return waterUseNo;
	}

	public void setWaterUseNo(String waterUseNo) {
		this.waterUseNo = waterUseNo;
	}

	public float getWaterUseQty() {
		return waterUseQty;
	}

	public void setWaterUseQty(float waterUseQty) {
		this.waterUseQty = waterUseQty;
	}

	public String getCustomerAttCqty1() {
		return customerAttCqty1;
	}

	public void setCustomerAttCqty1(String customerAttCqty1) {
		this.customerAttCqty1 = customerAttCqty1;
	}

	public String getCustomerAttCqty2() {
		return customerAttCqty2;
	}

	public void setCustomerAttCqty2(String customerAttCqty2) {
		this.customerAttCqty2 = customerAttCqty2;
	}

	public String getCustomerAttCqty3() {
		return customerAttCqty3;
	}

	public void setCustomerAttCqty3(String customerAttCqty3) {
		this.customerAttCqty3 = customerAttCqty3;
	}

	public String getCustomerAttCqty4() {
		return customerAttCqty4;
	}

	public void setCustomerAttCqty4(String customerAttCqty4) {
		this.customerAttCqty4 = customerAttCqty4;
	}

	public String getCustomerAttCqty5() {
		return customerAttCqty5;
	}

	public void setCustomerAttCqty5(String customerAttCqty5) {
		this.customerAttCqty5 = customerAttCqty5;
	}

	public String getCustomerAttCqty6() {
		return customerAttCqty6;
	}

	public void setCustomerAttCqty6(String customerAttCqty6) {
		this.customerAttCqty6 = customerAttCqty6;
	}

	public String getCustomerAttMemo() {
		return customerAttMemo;
	}

	public void setCustomerAttMemo(String customerAttMemo) {
		this.customerAttMemo = customerAttMemo;
	}

	@Override
	public String toString() {
		return "CustomerAtt [customerAttId=" + customerAttId + ", customerNo=" + customerNo + ", waterQuotaNo="
				+ waterQuotaNo + ", waterUseNo=" + waterUseNo + ", waterUseQty=" + waterUseQty + ", customerAttCqty1="
				+ customerAttCqty1 + ", customerAttCqty2=" + customerAttCqty2 + ", customerAttCqty3=" + customerAttCqty3
				+ ", customerAttCqty4=" + customerAttCqty4 + ", customerAttCqty5=" + customerAttCqty5
				+ ", customerAttCqty6=" + customerAttCqty6 + ", customerAttMemo=" + customerAttMemo + "]";
	}
	
	
	
}
