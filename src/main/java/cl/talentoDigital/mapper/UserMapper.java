package cl.talentoDigital.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cl.talentoDigital.models.Users;

@Mapper
//repository
public interface UserMapper {
	
	@Select("select * from users where email = #{email}")
	Users findByEmail(@Param("email") String email);
	
}
