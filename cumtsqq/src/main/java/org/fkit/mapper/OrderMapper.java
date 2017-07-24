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
import org.fkit.domain.Order;

public interface OrderMapper {
	@Select("select * from tb_order")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),		
		@Result(column = "good_id", property = "good_id")})
	List<Order> findAll();
	
	@Insert("insert into tb_order(good_id,good_count,good_sale,good_info,money) values(#{good_id},#{good_count},#{good_sale},#{good_info},#{money})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveOrder(Order order);
	
     //通过ID寻找订单
    @Select("select * from tb_order where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),				
		 @Result(column = "good_id", property = "good_id") })
	Order findorder(@Param("good_id") int good_id);
    //增加购物车订单数量
	@Update("update tb_order set good_count=good_count+1 where good_id=#{good_id}")
	void addOrder(Order order);
  //删除订单
    @Delete("delete from tb_order where good_id=#{good_id}")
	void removeOrder(Order order);
    
    @Update("update tb_order set good_info=#{good_info} where good_id=#{good_id}")
	void putOrder(Order order);
    
    @Update("update tb_order set good_info=#{good_info} where good_id=#{good_id}")
	void getOrder(Order order);
    
    @Update("update tb_order set logistics=#{logistics},server=#{server},quality=#{quality} where good_id=#{good_id}")
    void comment(Order order);

}  
