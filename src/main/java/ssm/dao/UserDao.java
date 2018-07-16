package ssm.dao;

import ssm.entity.User;

public interface UserDao {

	User findOneByUsername(String username);

	void creatUser(User user, String username);

}
