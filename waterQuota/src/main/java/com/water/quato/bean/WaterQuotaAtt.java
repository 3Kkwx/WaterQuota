package com.water.quato.bean;

import java.util.Date;

/**
 * 用水定额表 
 * @author HYZ
 *
 */
public class WaterQuotaAtt {

	/**
	 * id
	 */
	private int waterQuotaAttId;
	
	/**
	 * waterQuato_No,用水定额编号
	 */
	private String waterQuatoNo;
	
	/**
	 * waterUseNo，用水类型编号
	 */
	private String waterUseNo;
	
	/**
	 * waterUseQty，用水类型指标
	 * 如果为0，则表示自定义，例如实验室用水
	 */
	private float waterUseQty;
	
	/**
	 * waterQuotaAttUnit，计算参数单位
	 */
	private String waterQuotaAttUnit;
	
	/**
	 * waterQuotaAttPara1,计算参数1
	 */
	private String waterQuotaAttPara1;
	
	/**
	 * waterQuotaAttPara2,计算参数2
	 */
	private String waterQuotaAttPara2;
	
	/**
	 * waterQuotaAttPara3,计算参数3
	 */
	private String waterQuotaAttPara3;
	
	/**
	 * waterQuotaAttPara4,计算参数4
	 */
	private String waterQuotaAttPara4;
	
	/**
	 * waterQuotaAttPara5,计算参数5
	 */
	private String waterQuotaAttPara5;
	
	/**
	 * waterQuotaAttPara6,计算参数6
	 */
	private String waterQuotaAttPara6;
	
	/**
	 * waterQuotaAttFormula,计算公式符号
	 */
	private String waterQuotaAttFormula;
	
	/**
	 * waterQuotaAttMemo,备注信息
	 */
	private String waterQuotaAttMemo;

	/**
	 * editDate,编辑时间
	 */
	private Date editDate;
	
	/**
	 * userName,编辑人
	 */
	private String userName;

	public int getWaterQuotaAttId() {
		return waterQuotaAttId;
	}

	public void setWaterQuotaAttId(int waterQuotaAttId) {
		this.waterQuotaAttId = waterQuotaAttId;
	}

	public String getWaterQuatoNo() {
		return waterQuatoNo;
	}

	public void setWaterQuatoNo(String waterQuatoNo) {
		this.waterQuatoNo = waterQuatoNo;
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

	public String getWaterQuotaAttUnit() {
		return waterQuotaAttUnit;
	}

	public void setWaterQuotaAttUnit(String waterQuotaAttUnit) {
		this.waterQuotaAttUnit = waterQuotaAttUnit;
	}

	public String getWaterQuotaAttPara1() {
		return waterQuotaAttPara1;
	}

	public void setWaterQuotaAttPara1(String waterQuotaAttPara1) {
		this.waterQuotaAttPara1 = waterQuotaAttPara1;
	}

	public String getWaterQuotaAttPara2() {
		return waterQuotaAttPara2;
	}

	public void setWaterQuotaAttPara2(String waterQuotaAttPara2) {
		this.waterQuotaAttPara2 = waterQuotaAttPara2;
	}

	public String getWaterQuotaAttPara3() {
		return waterQuotaAttPara3;
	}

	public void setWaterQuotaAttPara3(String waterQuotaAttPara3) {
		this.waterQuotaAttPara3 = waterQuotaAttPara3;
	}

	public String getWaterQuotaAttPara4() {
		return waterQuotaAttPara4;
	}

	public void setWaterQuotaAttPara4(String waterQuotaAttPara4) {
		this.waterQuotaAttPara4 = waterQuotaAttPara4;
	}

	public String getWaterQuotaAttPara5() {
		return waterQuotaAttPara5;
	}

	public void setWaterQuotaAttPara5(String waterQuotaAttPara5) {
		this.waterQuotaAttPara5 = waterQuotaAttPara5;
	}

	public String getWaterQuotaAttPara6() {
		return waterQuotaAttPara6;
	}

	public void setWaterQuotaAttPara6(String waterQuotaAttPara6) {
		this.waterQuotaAttPara6 = waterQuotaAttPara6;
	}

	public String getWaterQuotaAttFormula() {
		return waterQuotaAttFormula;
	}

	public void setWaterQuotaAttFormula(String waterQuotaAttFormula) {
		this.waterQuotaAttFormula = waterQuotaAttFormula;
	}

	public String getWaterQuotaAttMemo() {
		return waterQuotaAttMemo;
	}

	public void setWaterQuotaAttMemo(String waterQuotaAttMemo) {
		this.waterQuotaAttMemo = waterQuotaAttMemo;
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

	@Override
	public String toString() {
		return "WaterQuotaAtt [waterQuotaAttId=" + waterQuotaAttId + ", waterQuatoNo=" + waterQuatoNo + ", waterUseNo="
				+ waterUseNo + ", waterUseQty=" + waterUseQty + ", waterQuotaAttUnit=" + waterQuotaAttUnit
				+ ", waterQuotaAttPara1=" + waterQuotaAttPara1 + ", waterQuotaAttPara2=" + waterQuotaAttPara2
				+ ", waterQuotaAttPara3=" + waterQuotaAttPara3 + ", waterQuotaAttPara4=" + waterQuotaAttPara4
				+ ", waterQuotaAttPara5=" + waterQuotaAttPara5 + ", waterQuotaAttPara6=" + waterQuotaAttPara6
				+ ", waterQuotaAttFormula=" + waterQuotaAttFormula + ", waterQuotaAttMemo=" + waterQuotaAttMemo
				+ ", editDate=" + editDate + ", userName=" + userName + "]";
	}
	
	
	
}
