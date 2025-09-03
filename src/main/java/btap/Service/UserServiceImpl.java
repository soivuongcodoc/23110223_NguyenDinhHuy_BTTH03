package btap.Service;

import btap.DAO.UserDao;
import btap.DAO.UserDaoImpl;
import btap.Model.User;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String username, String password) {
        User user = userDao.get(username);
        if (user != null && password.equals(user.getPassWord())) {
            return user;
        }
        return null;
    }
    @Override
	public void insert(User user) {
		userDao.insert(user);
	};

	@Override
	public boolean register( String username, String password, String email, String fullname, String phone) {
		if (userDao.checkExistUsername(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDao.insert(new User(0,email, username, fullname, password, null, 5, phone, date));
		return true;
	}

	public boolean checkExistEmail(String email) {
		return userDao.checkExistEmail(email);
	}

	public boolean checkExistUsername(String username) {
		return userDao.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDao.checkExistPhone(phone);
	}
	@Override
	public User getByEmail(String email) {
	    return userDao.getByEmail(email);
	}

}
