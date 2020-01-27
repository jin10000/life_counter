package org.king.life_counter.dao;

import java.util.List;

import org.king.life_counter.vo.User;

public interface UserDao {
	
	public User selectUserById(String id);
	// id 기반으로 사람 있는지 확인
	
	public List<User> selectAllUser();
	// 모든유저 가져와
	
	public List<User> selectUserByNickname(String nickname);
	// nickName 기반으로 사람 있는지 확인
}
