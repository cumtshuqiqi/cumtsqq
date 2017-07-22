package org.fkit.domain;

import java.util.List;

public class Cart {
	public List<Good> getGood() {
		return good;
	}

	public void setGood(List<Good> good) {
		this.good = good;
	}

	private int id;
	private List<Good> good;
	private int good_id;
	private int good_count;
	private int user_id;
	
	
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", good=" + good + ", good_count=" + good_count + ", good_id=" + good_id + ", user_id="
				+ user_id + "]";
	}
}
