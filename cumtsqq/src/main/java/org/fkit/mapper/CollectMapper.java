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
import org.apache.ibatis.mapping.FetchType;
import org.fkit.domain.Collect;

public interface CollectMapper {
	@Select("select * from tb_collect")
	@Results({ @Result(id = true, column = "id", property = "id"),
		@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),		
		 @Result(column = "good_id", property = "good_id")})
	List<Collect> findAll();
	//进行收藏
	@Insert("insert into tb_collect(good_id) values(#{good_id})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int saveCollect(Collect collect);
     //通过ID寻找商品
    @Select("select * from tb_collect where good_id=#{good_id}")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "good_id", property = "good", many = @Many(select = "org.fkit.mapper.GoodMapper.selectByGood_id", fetchType = FetchType.LAZY)),				
			 @Result(column = "good_id", property = "good_id") })
    Collect findWithId(@Param("good_id") int good_id);
    //清空收藏
    @Delete("delete from tb_collect ")
	void clearCollect();
    //删除商品
    @Delete("delete from tb_collect where good_id=#{good_id}")
	void removeCollect(Collect collect);


}
