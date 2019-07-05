package com.water.quato.bean;

import java.util.Date;

public abstract class HistoryRecord {

	/**
	 * id
	 */
	private int historyRecordId;
	
	/**
	 * 修改的数据表名
	 */
	private String historyRecordTable;
	
	/**
	 * 修改数据表的字段名
	 */
	private String historyRecordField;
	
	/**
	 * 修改数据表的主键值
	 */
	private String historyRecordPk;
	
	/**
	 * 该字段原来的值
	 */
	private float historyRecordOldValue;
	
	/**
	 * 该字段新值
	 */
	private float historyRecordNewValue;
	
	/**
	 * 编辑时间
	 */
	private Date editDate;
	
	/**
	 * 编辑人
	 */
	private String userName;
	
	/**
	 * 备注信息
	 */
	private String historyRecordMemo;

	public int getHistoryRecordId() {
		return historyRecordId;
	}

	public void setHistoryRecordId(int historyRecordId) {
		this.historyRecordId = historyRecordId;
	}

	public String getHistoryRecordTable() {
		return historyRecordTable;
	}

	public void setHistoryRecordTable(String historyRecordTable) {
		this.historyRecordTable = historyRecordTable;
	}

	public String getHistoryRecordField() {
		return historyRecordField;
	}

	public void setHistoryRecordField(String historyRecordField) {
		this.historyRecordField = historyRecordField;
	}

	public String getHistoryRecordPk() {
		return historyRecordPk;
	}

	public void setHistoryRecordPk(String historyRecordPk) {
		this.historyRecordPk = historyRecordPk;
	}

	public float getHistoryRecordOldValue() {
		return historyRecordOldValue;
	}

	public void setHistoryRecordOldValue(float historyRecordOldValue) {
		this.historyRecordOldValue = historyRecordOldValue;
	}

	public float getHistoryRecordNewValue() {
		return historyRecordNewValue;
	}

	public void setHistoryRecordNewValue(float historyRecordNewValue) {
		this.historyRecordNewValue = historyRecordNewValue;
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

	public String getHistoryRecordMemo() {
		return historyRecordMemo;
	}

	public void setHistoryRecordMemo(String historyRecordMemo) {
		this.historyRecordMemo = historyRecordMemo;
	}

	@Override
	public String toString() {
		return "HistoryRecord [historyRecordId=" + historyRecordId + ", historyRecordTable=" + historyRecordTable
				+ ", historyRecordField=" + historyRecordField + ", historyRecordPk=" + historyRecordPk
				+ ", historyRecordOldValue=" + historyRecordOldValue + ", historyRecordNewValue="
				+ historyRecordNewValue + ", editDate=" + editDate + ", userName=" + userName + ", historyRecordMemo="
				+ historyRecordMemo + "]";
	}
	
	
}
