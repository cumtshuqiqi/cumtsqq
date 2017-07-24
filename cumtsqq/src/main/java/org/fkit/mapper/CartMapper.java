package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Cart;

public interface CartMapper {
	@Select("select * from tb_cart")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),		
		@Result(column = "good_count", property = "good_count"), @Result(column = "good_id", property = "good_id")})
	List<Cart> findAll();
	
	@Insert("insert into tb_cart(good_id,good_count) values(#{good_id},#{good_count})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCart(Cart cart);
     //通过ID寻找商品
    @Select("select * from tb_cart where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),				
			@Result(column = "good_count", property = "good_count"), @Result(column = "good_id", property = "good_id") })
	Cart findWithId(@Param("good_id") int good_id);
    //增加购物车商品数量
    @Update("update tb_cart set good_count=good_count+1 where good_id=#{good_id}")
	void addCart(Cart cart);
    //减少购物车商品数量
    @Update("update tb_cart set good_count=good_count-1 where good_id=#{good_id}")
	void reduceCart(Cart cart);
    //删除商品
    @Delete("delete from tb_cart where good_id=#{good_id}")
	void removeCart(Cart cart);
    //获取输入框中的数量
    @Update("update tb_cart set good_count=#{good_count} where good_id=#{good_id}")
    void get(Cart cart);

}
