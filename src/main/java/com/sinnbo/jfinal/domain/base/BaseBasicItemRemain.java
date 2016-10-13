package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBasicItemRemain<M extends BaseBasicItemRemain<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setOrgName(java.lang.String orgName) {
		set("org_name", orgName);
	}

	public java.lang.String getOrgName() {
		return get("org_name");
	}

	public void setOrgCode(java.lang.String orgCode) {
		set("org_code", orgCode);
	}

	public java.lang.String getOrgCode() {
		return get("org_code");
	}

	public void setOrgContact(java.lang.String orgContact) {
		set("org_contact", orgContact);
	}

	public java.lang.String getOrgContact() {
		return get("org_contact");
	}

	public void setOrgType(java.lang.Integer orgType) {
		set("org_type", orgType);
	}

	public java.lang.Integer getOrgType() {
		return get("org_type");
	}

	public void setOrgQq(java.lang.String orgQq) {
		set("org_qq", orgQq);
	}

	public java.lang.String getOrgQq() {
		return get("org_qq");
	}

	public void setOrgWechat(java.lang.String orgWechat) {
		set("org_wechat", orgWechat);
	}

	public java.lang.String getOrgWechat() {
		return get("org_wechat");
	}

	public void setOrgEmail(java.lang.String orgEmail) {
		set("org_email", orgEmail);
	}

	public java.lang.String getOrgEmail() {
		return get("org_email");
	}

	public void setOrgHome(java.lang.String orgHome) {
		set("org_home", orgHome);
	}

	public java.lang.String getOrgHome() {
		return get("org_home");
	}

	public void setIsBacklist(java.lang.Integer isBacklist) {
		set("is_backlist", isBacklist);
	}

	public java.lang.Integer getIsBacklist() {
		return get("is_backlist");
	}

	public void setCount(java.lang.Integer count) {
		set("count", count);
	}

	public java.lang.Integer getCount() {
		return get("count");
	}

	public void setLastTime(java.util.Date lastTime) {
		set("last_time", lastTime);
	}

	public java.util.Date getLastTime() {
		return get("last_time");
	}

	public void setNote(java.lang.String note) {
		set("note", note);
	}

	public java.lang.String getNote() {
		return get("note");
	}

}