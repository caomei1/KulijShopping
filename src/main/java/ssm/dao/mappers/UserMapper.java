package ssm.dao.mappers;

import org.apache.ibatis.annotations.Param;

import ssm.entity.User;

public interface UserMapper {

	User findOneByUsername(@Param("userName")String username);
	
}
