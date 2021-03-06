package ssm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.dao.mappers.UserMapper;
import ssm.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findOneByUsername(String username) {
		return userMapper.findOneByUsername(username);
	}

	@Override
	public void creatUser(User user, String username) {
		userMapper.creatUser(user, username);
	}

}
