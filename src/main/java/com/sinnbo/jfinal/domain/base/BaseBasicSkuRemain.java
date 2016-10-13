package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBasicSkuRemain<M extends BaseBasicSkuRemain<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setRemainId(java.lang.Integer remainId) {
		set("remain_id", remainId);
	}

	public java.lang.Integer getRemainId() {
		return get("remain_id");
	}

	public void setSkuId(java.lang.Integer skuId) {
		set("sku_id", skuId);
	}

	public java.lang.Integer getSkuId() {
		return get("sku_id");
	}

	public void setBatchId(java.lang.Integer batchId) {
		set("batch_id", batchId);
	}

	public java.lang.Integer getBatchId() {
		return get("batch_id");
	}

	public void setCount(java.lang.Integer count) {
		set("count", count);
	}

	public java.lang.Integer getCount() {
		return get("count");
	}

	public void setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
	}

	public java.lang.Integer getDataStatus() {
		return get("data_status");
	}

}
