package com.water.quato.bean;

import java.util.Date;

public class WaterUse {

	/**
	 * 自增长ID
	 */
	private int waterUseId;
	
	/**
	 * 用水类型编号
	 */
	private String waterUseNo;
	
	/**
	 * 用水类型名称
	 */
	private String waterUseName;
	
	/**
	 * 用水类型单位
	 */
	private String waterUseUnit;
	
	/**
	 * 编辑时间
	 */
	private Date editDate;
	
	/**
	 * 编辑人（用户名）
	 */
	private String userName;

	public int getWaterUseId() {
		return waterUseId;
	}

	public void setWaterUseId(int waterUseId) {
		this.waterUseId = waterUseId;
	}

	public String getWaterUseNo() {
		return waterUseNo;
	}

	public void setWaterUseNo(String waterUseNo) {
		this.waterUseNo = waterUseNo;
	}

	public String getWaterUseName() {
		return waterUseName;
	}

	public void setWaterUseName(String waterUseName) {
		this.waterUseName = waterUseName;
	}

	public String getWaterUseUnit() {
		return waterUseUnit;
	}

	public void setWaterUseUnit(String waterUseUnit) {
		this.waterUseUnit = waterUseUnit;
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
		return "WaterUse [waterUseId=" + waterUseId + ", waterUseNo=" + waterUseNo + ", waterUseName=" + waterUseName
				+ ", waterUseUnit=" + waterUseUnit + ", editDate=" + editDate + ", userName=" + userName + "]";
	}
	
	
	
}
