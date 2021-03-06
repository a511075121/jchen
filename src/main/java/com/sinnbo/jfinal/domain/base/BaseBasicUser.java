package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBasicUser<M extends BaseBasicUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return get("user_name");
	}

	public void setUserPasswd(java.lang.String userPasswd) {
		set("user_passwd", userPasswd);
	}

	public java.lang.String getUserPasswd() {
		return get("user_passwd");
	}

	public void setSolt(java.lang.String solt) {
		set("solt", solt);
	}

	public java.lang.String getSolt() {
		return get("solt");
	}

	public void setUserType(java.lang.Integer userType) {
		set("user_type", userType);
	}

	public java.lang.Integer getUserType() {
		return get("user_type");
	}

	public void setEmployeeId(java.lang.Integer employeeId) {
		set("employee_id", employeeId);
	}

	public java.lang.Integer getEmployeeId() {
		return get("employee_id");
	}

	public void setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
	}

	public java.lang.Integer getDataStatus() {
		return get("data_status");
	}

}
