package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Good;
import org.fkit.mapper.GoodMapper;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("GoodService")
public class GoodServiceImpl implements GoodService{
	/**
	 * 自动注入GoodMapper
	 * */
	@Autowired
	private GoodMapper goodMapper;
	@Transactional(readOnly=true)
    @Override	
	public List<Good> skgetAll(String good_type) {
		// TODO Auto-generated method stub
		return goodMapper.skfindAll(good_type);
	}
	
	@Transactional(readOnly=true)
    @Override
    public List<Good> cogetAll(String good_type) {
		// TODO Auto-generated method stub
		return goodMapper.cofindAll(good_type);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Good> pagetAll(String good_type) {
		// TODO Auto-generated method stub
		return goodMapper.pafindAll(good_type);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Good> shgetAll(String good_type) {
		// TODO Auto-generated method stub
		return goodMapper.shfindAll(good_type);
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		// TODO Auto-generated method stub
		return goodMapper.findAll();
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<Good> segetAll(Integer good_id) {
		// TODO Auto-generated method stub
		return goodMapper.sefindAll(good_id);
	}
	
	@Override
	public Good goodadd(Integer good_id, String good_name,String good_image,String good_shoper,String good_type,Integer good_count,Integer good_price,String good_intro) {
		Good good=new Good();
		good.setGood_id(good_id);
		good.setGood_name(good_name);
		good.setGood_image(good_image);
		good.setGood_shoper(good_shoper);
		good.setGood_type(good_type);
		good.setGood_count(good_count);
		good.setGood_price(good_price);
		good.setGood_intro(good_intro);
		goodMapper.saveGood(good);
		return good;
		}
	
	
	@Override
	public Good removeGood(Integer good_id) {
		// TODO Auto-generated method stub
		Good good = goodMapper.findWithId(good_id);
		goodMapper.removeGood(good);
		return good;
	}
	
//	@Override
//	public Good goodupdate(int good_id, String good_name, String good_image, String good_shoper, String good_type, Integer good_count, Integer good_price, String good_intro) {
//		// TODO Auto-generated method stub
//		Good good = new Good();
//		good = goodMapper.findWithId(good_id);
//		good.setGood_id(good_id);
//		good.setGood_count(good_count);
//		good.setGood_name(good_name);
//		good.setGood_image(good_image);
//		good.setGood_shoper(good_shoper);
//		good.setGood_type(good_type);
//		good.setGood_price(good_price);
//		good.setGood_intro(good_intro);
//		goodMapper.goodupdate(good);
//		return good;
//	}
	
	@Override
	public Good findWithId(Integer good_id) {
		// TODO Auto-generated method stub
		return goodMapper.findWithId(good_id);
	}

	@Override
	public Good goodupdate(Integer good_id_,String good_name, String good_image, String good_shoper, String good_type,
			Integer good_count, Integer good_sale, Integer good_price, String good_intro) {
		// TODO Auto-generated method stub
		Good good = new Good();
		good = goodMapper.findWithId(good_id_);
		good.setGood_id(good_id_);
		good.setGood_count(good_count);
		good.setGood_count(good_sale);
		good.setGood_name(good_name);
		good.setGood_image(good_image);
		good.setGood_shoper(good_shoper);
		good.setGood_type(good_type);
		good.setGood_price(good_price);
		good.setGood_intro(good_intro);
		goodMapper.goodupdate(good);
		return good;
	}

}
