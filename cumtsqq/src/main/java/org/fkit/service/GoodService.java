package org.fkit.service;

import java.util.List;


import org.fkit.domain.Good;

public interface GoodService {
	/**
	 * 查找所有商品
	 * @param good-ype 
	 * @return 商品对象集合
	 * */
	//遍历裙子的集合
	List<Good> skgetAll(String good_type);
	/**
	 * 查找所有图书
	 * @param booktype 
	 * @return 科技Book对象集合
	 * */
	//遍历上衣的集合
	List<Good> cogetAll(String good_type);
  //遍历鞋子的集合
    List<Good> pagetAll(String good_type);
//遍历鞋子集合
	List<Good> shgetAll(String good_type);
	//遍历所有商品
	List<Good> getAll();
	//遍历商品;	
	
	Good goodadd(Integer good_id, String good_name,String good_image,String good_shoper,String good_type,Integer good_count,Integer good_price,String good_intro);
	Good removeGood(Integer good_id_);
	List<Good> segetAll(Integer good_id );
	Good findWithId(Integer good_id);
	Good goodupdate(Integer good_id_, String good_name, String good_image, String good_shoper, String good_type,Integer good_count, Integer good_sale, Integer good_price, String good_intro);

	
}
