package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBasicEmployee<M extends BaseBasicEmployee<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setEmployeeName(java.lang.String employeeName) {
		set("employee_name", employeeName);
	}

	public java.lang.String getEmployeeName() {
		return get("employee_name");
	}

	public void setEmployeeNum(java.lang.String employeeNum) {
		set("employee_num", employeeNum);
	}

	public java.lang.String getEmployeeNum() {
		return get("employee_num");
	}

	public void setGender(java.lang.Integer gender) {
		set("gender", gender);
	}

	public java.lang.Integer getGender() {
		return get("gender");
	}

	public void setBirthdate(java.util.Date birthdate) {
		set("birthdate", birthdate);
	}

	public java.util.Date getBirthdate() {
		return get("birthdate");
	}

	public void setAreaId(java.lang.Integer areaId) {
		set("area_id", areaId);
	}

	public java.lang.Integer getAreaId() {
		return get("area_id");
	}

	public void setHighEducation(java.lang.Integer highEducation) {
		set("high_education", highEducation);
	}

	public java.lang.Integer getHighEducation() {
		return get("high_education");
	}

	public void setNowPosition(java.lang.String nowPosition) {
		set("now_position", nowPosition);
	}

	public java.lang.String getNowPosition() {
		return get("now_position");
	}

	public void setHeadImg(java.lang.String headImg) {
		set("head_img", headImg);
	}

	public java.lang.String getHeadImg() {
		return get("head_img");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setNote(java.lang.String note) {
		set("note", note);
	}

	public java.lang.String getNote() {
		return get("note");
	}

	public void setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
	}

	public java.lang.Integer getDataStatus() {
		return get("data_status");
	}

}