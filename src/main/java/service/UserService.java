package service;

import java.util.List;

import model.User;

public interface UserService {
	public long createUser(User user);
    public List<User> getAllUsers();
    public User getUser(long id);	
}
