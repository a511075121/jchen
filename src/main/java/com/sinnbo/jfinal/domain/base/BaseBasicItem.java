package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBasicItem<M extends BaseBasicItem<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setItemName(java.lang.String itemName) {
		set("item_name", itemName);
	}

	public java.lang.String getItemName() {
		return get("item_name");
	}

	public void setItemType(java.lang.Integer itemType) {
		set("item_type", itemType);
	}

	public java.lang.Integer getItemType() {
		return get("item_type");
	}

	public void setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
	}

	public java.lang.Integer getDataStatus() {
		return get("data_status");
	}

}
