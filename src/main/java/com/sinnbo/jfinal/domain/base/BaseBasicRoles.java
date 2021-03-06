package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBasicRoles<M extends BaseBasicRoles<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setRoleName(java.lang.String roleName) {
		set("role_name", roleName);
	}

	public java.lang.String getRoleName() {
		return get("role_name");
	}

	public void setRoleType(java.lang.Integer roleType) {
		set("role_type", roleType);
	}

	public java.lang.Integer getRoleType() {
		return get("role_type");
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
