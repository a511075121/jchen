package com.sinnbo.jfinal.domain.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOnlineOrderCustomer<M extends BaseOnlineOrderCustomer<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setSkuId(java.lang.Integer skuId) {
		set("sku_id", skuId);
	}

	public java.lang.Integer getSkuId() {
		return get("sku_id");
	}

	public void setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
	}

	public java.lang.Integer getOrderId() {
		return get("order_id");
	}

	public void setCount(java.lang.Integer count) {
		set("count", count);
	}

	public java.lang.Integer getCount() {
		return get("count");
	}

	public void setTotalPrice(java.lang.Double totalPrice) {
		set("total_price", totalPrice);
	}

	public java.lang.Double getTotalPrice() {
		return get("total_price");
	}

	public void setDataStatus(java.lang.Integer dataStatus) {
		set("data_status", dataStatus);
	}

	public java.lang.Integer getDataStatus() {
		return get("data_status");
	}

}
