package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Shoper;

/**
 * ShoperMapper接口
 * */
public interface ShoperMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param Integer shoper_id
	 * @param String shoper_password
	 * @return 找到返回Shoper对象，没有找到返回null
	 * */
	@Select("select * from tb_shoper where shoper_id = #{shoper_id} and shoper_password = #{shoper_password}")
	Shoper findWithShoper_nameAndShoper_password(@Param("shoper_id")Integer shoper_id,
			@Param("shoper_password") String shoper_password);
	/*z注册账户*/
	@Insert("insert into tb_shoper(shoper_id,shoper_name,shoper_password,shoper_phone,shoper_address) values(#{shoper_id},#{shoper_name},#{shoper_password},#{shoper_phone},#{shoper_address})")
	@Options(useGeneratedKeys = true, keyProperty = "shoper_id")
	 int saveShoper(Shoper shoper);
	 
	 @Select("select * from tb_shoper where shoper_id=#{shoper_id}")
		@Results({ @Result( id= true, column = "shoper_id", property = "shoper_id"), @Result(column = "shoper_name", property = "shoper_name"),
				 @Result(column = "shoper_password", property = "shoper_password"),
				@Result(column = "shoper_phone", property = "shoper_phone"),@Result(column = "shoper_address", property = "shoper_address"),
				 })
		List<Shoper> selectByShoperId(Integer shoper_id);
	 @Select("select * from tb_shoper where shoper_name=#{shoper_name} and shoper_phone=#{shoper_phone}")
	 Shoper findShoper_password(@Param("shoper_name") String shoper_name, @Param("shoper_phone") String shoper_phone);

}
