package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import dao.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}
	
    @Autowired
    private UserDao userDao;

	@Override
	public long createUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getUser(long id) {
		return userDao.getUser(id);
	}

}
