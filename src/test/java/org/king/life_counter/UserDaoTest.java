package org.king.life_counter;

import static org.junit.Assert.assertThat;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.king.life_counter.dao.UserDao;
import org.king.life_counter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.hamcrest.CoreMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@WebAppConfiguration
public class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void selectUserByIdTest() throws SQLException {
		String id = "jin10000";
		User user = userDao.selectUserById(id);
		System.out.println("가져온 유저 정보 : " + user);
		assertThat(user, notNullValue());
	}

	@Test
	public void selectAllUserTest() throws SQLException {
		List<User> userList = userDao.selectAllUser();
		int userCount = userList.size();
		System.out.println("현재 전체 유저 수 :" + userCount);
		boolean bool = userCount > 0 ? true : false;
		assertThat(bool, is(true));

	}

	@Test
	public void selectUserByNicknameTest() throws SQLException {
		String nickName = "jih";
		List<User> userList = userDao.selectUserByNickname(nickName);

		// 못가져오면 null
		assertThat(userList, notNullValue());

		boolean nickCheck = true;
		for (User user : userList) {
			String tempNick = user.getNickname();
			nickCheck = nickName.equals(tempNick) ? true : false;
		}
		assertThat(nickCheck, is(true));
	}

}