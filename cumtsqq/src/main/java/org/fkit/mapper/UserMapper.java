package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param Integer user_id
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where user_id = #{user_id} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("user_id")Integer user_id,
			@Param("password") String password);
	/*注册账户*/
	@Insert("insert into tb_user(user_id,loginname,password,email,phone,address) values(#{user_id},#{loginname},#{password},#{email},#{phone},#{address})")
	@Options(useGeneratedKeys = true, keyProperty = "user_id")
	 int saveUser(User user);
	 @Select("select * from tb_user where user_id=#{user_id}")
		@Results({ @Result( id= true, column = "user_id", property = "user_id"), @Result(column = "loginname", property = "loginname"),
				@Result(column = "email", property = "email"), @Result(column = "password", property = "password"),
				@Result(column = "phone", property = "phone"),@Result(column = "address", property = "address"),
				 })
		List<User> selectByUserId(Integer user_id);
	//找回密码
	 @Select("select * from tb_user where loginname=#{loginname} and email=#{email}")
	User find(@Param("loginname") String loginname, @Param("email") String email);
	//修改密码
	 @Update("update tb_user set password=#{password} where  user_id=#{user_id}")
		void update(User user);
		//根据user_id找user
	 @Select("select * from tb_user where user_id=#{user_id}")
	 User findByUser_Id(@Param("user_id") Integer user_id);

}


