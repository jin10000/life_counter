package org.king.life_counter.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.king.life_counter.dao.UserDao;
import org.king.life_counter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public User selectUserById(String id) {
		return sqlSession.selectOne("userMapper.selectUserById",id);
	}

	@Override
	public List<User> selectAllUser() {
		return sqlSession.selectList("userMapper.selectAllUser");
	}

	@Override
	public List<User> selectUserByNickname(String nickname) {
		return sqlSession.selectList("userMapper.selectUserByNickname");
	}


}
