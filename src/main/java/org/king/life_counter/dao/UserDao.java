package org.king.life_counter.dao;

import java.util.List;

import org.king.life_counter.vo.User;

public interface UserDao {
	
	public User selectUserById(String id);
	// id ������� ��� �ִ��� Ȯ��
	
	public List<User> selectAllUser();
	// ������� ������
	
	public List<User> selectUserByNickname(String nickname);
	// nickName ������� ��� �ִ��� Ȯ��
}
