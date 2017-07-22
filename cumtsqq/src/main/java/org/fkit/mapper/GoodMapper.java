package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Good;

public interface GoodMapper {
	/**
	 * 查询所有商品
	 * 
	 * @return 裙子对象集合
	 */
	//查询所有裙子的集合
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> skfindAll(@Param("good_type") String good_type);
	
	@Select("select * from tb_good where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "good_id", property = "good_id"), @Result(column = "good_image", property = "good_image"),
		 	@Result(column = "good_image1", property = "good_image1"), @Result(column = "good_image1", property = "good_image1"),
			@Result(column = "good_nomber", property = "good_nomber"), @Result(column = "good_type", property = "good_type"),
			@Result(column = "good_name", property = "good_name"),
			@Result(column = "good_intro", property = "good_intro"), @Result(column = "good_price", property = "good_price"),
			@Result(column = "good_count", property = "good_count")})
	List<Good> selectByGood_id(Integer good_id);
	
	
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> cofindAll(@Param("good_type") String good_type);
	
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> pafindAll(@Param("good_type") String good_type);
	
	@Select("select * from tb_good where good_type=#{good_type}")
	List<Good> shfindAll(@Param("good_type") String good_type);
	
	@Select("select * from tb_good where good_id=#{good_id}")
	List<Good> sefindAll(@Param("good_id") Integer good_id);
	
	@Select("select * from tb_good ")
	List<Good> findAll();

	@Select("select * from tb_good where good_id=#{good_id}")
	List<Good> upfindAll(Integer good_id);	
	
	@Insert("insert into tb_good(good_id, good_name,good_image,good_shoper,good_type,good_count,good_price,good_intro) values(#{good_id},#{good_name},#{good_image},#{good_shoper},#{good_type},#{good_count},#{good_price},#{good_intro})")
	@Options(useGeneratedKeys = true, keyProperty = "good_id")
	 int saveGood(Good good);
	 
	@Delete("delete from tb_good where good_id=#{good_id}")
	void removeGood(Good good);
	
	@Select("select * from tb_good where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),				
			 @Result(column = "good_id", property = "good_id") })
	Good findWithId(@Param("good_id") Integer good_id);
	
	@Update("update tb_good set good_name=#{good_name},good_image=#{good_image},good_shoper=#{good_shoper},good_type=#{good_type},good_count=#{good_count},good_sale=#{good_sale},good_price=#{good_price},good_intro=#{good_intro} where good_id=#{good_id}")
	void goodupdate(Good good);
}
