package org.fkit.domain;

import java.io.Serializable;
import java.util.List;

public class Good implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -640552798346550269L;
	private Integer good_id;			// good_id
	private String good_name;	// 商品名
	private String good_image;	// 商品图片
	private String good_image1;
	private String good_image2;
	private String good_shoper;	// 产商
	private String good_type;		// 商品类型
	private Integer good_count;		// 商品库存
	private Integer  good_sale;
	private Integer good_price;		// 商品价格
	private String good_intro;		// 商品介绍	
	
	private List<Good> good;
	
	public List<Good> getGood() {
		return good;
	}
	public void setGood(List<Good> good) {
		this.good = good;
	}
	
	public Good() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getGood_image() {
		return good_image;
	}
	public void setGood_image(String good_image) {
		this.good_image = good_image;
	}
	public String getGood_shoper() {
		return good_shoper;
	}
	public void setGood_shoper(String good_shoper) {
		this.good_shoper = good_shoper;
	}
	public String getGood_type() {
		return good_type;
	}
	public void setGood_type(String good_type) {
		this.good_type = good_type;
	}
	public Integer getGood_count() {
		return good_count;
	}
	public void setGood_count(Integer good_count) {
		this.good_count = good_count;
	}
	public Integer getGood_price() {
		return good_price;
	}
	public void setGood_price(Integer good_price) {
		this.good_price = good_price;
	}
	public String getGood_intro() {
		return good_intro;
	}
	public void setGood_intro(String good_intro) {
		this.good_intro = good_intro;
	}
	@Override
	public String toString() {
		return "User [good_id=" + good_id + ", good_name=" + good_name + ", good_image="
				+ good_image + ", good_shoper=" + good_shoper + ", good_type=" + good_type
				+ ", good_count=" + good_count + ",good_sale="+good_sale+", good_price=" + good_price + ", good_intro=" + good_intro + "]";
	}
	public Integer getGood_sale() {
		return good_sale;
	}
	public void setGood_sale(Integer good_sale) {
		this.good_sale = good_sale;
	}
	public String getGood_image1() {
		return good_image1;
	}
	public void setGood_image1(String good_image1) {
		this.good_image1 = good_image1;
	}
	public String getGood_image2() {
		return good_image2;
	}
	public void setGood_image2(String good_image2) {
		this.good_image2 = good_image2;
	}
	
	

	
}