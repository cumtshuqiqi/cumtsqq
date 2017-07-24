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
	private String server;
	private String quality;
	private String logistics;
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
				+ user_id + ",good_info="+good_info+",server="+server+",logistics="+logistics+",quality="+quality+""
						+ ",money="+money+",good_sale="+good_sale+"]";
	}


	public String getLogistics() {
		return logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
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

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
}
