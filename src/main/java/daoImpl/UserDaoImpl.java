package daoImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import dao.UserDao;
import model.User;
import util.HibernateUtil;

public class UserDaoImpl implements UserDao {

	@Autowired
    private HibernateUtil hibernateUtil;
	
	
	@Override
	public long createUser(User user) {
		String query = "SELECT e.* FROM e.User e "
				+ "WHERE e.name like '%"+ user.getName() +"%' AND "
						+ "e.fam like '%"+ user.getFam() +"%' AND"
								+ "e.lastName like '%"+ user.getLastName() +"%' AND"
										+ "e.telephone like '%"+ user.getTelephone() +"%'";
		List<Object[]> result = hibernateUtil.fetchAll(query);
		if(result.size()==0)
			return (Long) hibernateUtil.create(user);
		else 
			return 0;
	}

	@Override
	public List<User> getAllUsers() {
		return hibernateUtil.fetchAll(User.class);
	}

	@Override
	public User getUser(long id) {
		return hibernateUtil.fetchById(id, User.class);
	}

}
