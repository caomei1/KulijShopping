package ssm.service;

import ssm.entity.User;

public interface UserService{

	User findOneByUsername(String username);

	void creatUser(User user, String username);

}
