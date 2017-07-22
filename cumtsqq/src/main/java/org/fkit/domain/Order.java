package org.fkit.domain;

import java.util.List;

public class Order {
	public List<Good> getGood() {
		return good;
	}

	public void setGood(List<Good> good) {
		this.good = good;
	}

	private int order_id;
	private List<Good> good;
	private int good_id;
	private int good_count;
	private int good_sale;
	private int user_id;
	private String good_info;
	private String description;
	private String logistics;
	private String service;
	private int money;
	
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	public int getGood_id() {
		return good_id;
	}

	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}
	
	public int getGood_count() {
		return good_count;
	}

	public void setGood_count(int good_count) {
		this.good_count = good_count;
	}
	
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	

	public String getGood_info() {
		return good_info;
	}

	public void setGood_info(String good_info) {
		this.good_info = good_info;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + order_id + ", good=" + good + ", good_count=" + good_count + ", good_id=" + good_id + ", user_id="
				+ user_id + ",good_info="+good_info+",description="+description+",logistics="+logistics+",service="+service+""
						+ ",money="+money+",good_sale="+good_sale+"]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogistics() {
		return logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getGood_sale() {
		return good_sale;
	}

	public void setGood_sale(int good_sale) {
		this.good_sale = good_sale;
	}
}
