package org.king.life_counter.service.impl;

import org.king.life_counter.dao.UserDao;
import org.king.life_counter.service.UserService;
import org.king.life_counter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(User user) {
		String id = user.getId();
		//String pw = user.getPw();
		
		User registeredUser =  userDao.selectUserById(id);
		
		if(registeredUser == null) {
			return false;
		}
		
		return true;
	}

}
