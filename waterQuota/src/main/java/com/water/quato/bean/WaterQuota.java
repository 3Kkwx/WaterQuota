package com.water.quato.bean;

import java.util.Date;

/**
 * waterQuato 用水类型表 
 * 例如： 101 非寄宿师生生活用水  M3/人、日
 * @author HYZ
 *
 */
public class WaterQuota {
	
	/**
     * id，用水定额ID
     */
	private int waterQuotaId;
	/**
     * waterQuotaNo,用水定额编号 
     * 如：101
     */
	private String waterQuotaNo;
	/**
     * waterQuatoName，用水定额名称
     * 如：非寄宿师生用水
     */
	private String waterQuotaName;
	/**
     * EditDate，编辑时间
     */
	private Date editDate;
	
	/**
     * UserName，编辑人
     */
	private String userName;
	
	/**
	 * waterQuato_Memo,备注信息
	 */
	private String waterQuotaMemo;

	public int getWaterQuotaId() {
		return waterQuotaId;
	}

	public void setWaterQuotaId(int waterQuotaId) {
		this.waterQuotaId = waterQuotaId;
	}

	public String getWaterQuotaNo() {
		return waterQuotaNo;
	}

	public void setWaterQuotaNo(String waterQuotaNo) {
		this.waterQuotaNo = waterQuotaNo;
	}

	public String getWaterQuotaName() {
		return waterQuotaName;
	}

	public void setWaterQuotaName(String waterQuotaName) {
		this.waterQuotaName = waterQuotaName;
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

	public String getWaterQuotaMemo() {
		return waterQuotaMemo;
	}

	public void setWaterQuotaMemo(String waterQuotaMemo) {
		this.waterQuotaMemo = waterQuotaMemo;
	}

	@Override
	public String toString() {
		return "WaterQuota [waterQuotaId=" + waterQuotaId + ", waterQuotaNo=" + waterQuotaNo + ", waterQuotaName="
				+ waterQuotaName + ", editDate=" + editDate + ", userName=" + userName + ", waterQuotaMemo="
				+ waterQuotaMemo + "]";
	}
	
	
	
}
