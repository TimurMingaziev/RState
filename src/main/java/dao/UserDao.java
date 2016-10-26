package dao;

import java.util.List;

import model.User;


public interface UserDao {
	public long createUser(User user);
    public List<User> getAllUsers();
    public User getUser(long id);	
}
