package ssm.dao.mappers;

import org.apache.ibatis.annotations.Param;

import ssm.entity.User;

public interface UserMapper {

	User findOneByUsername(String username);

	void creatUser(User user, @Param("userName")String username);
	
}
