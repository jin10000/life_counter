package org.king.life_counter;

import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.hamcrest.CoreMatchers.*;

import com.mysql.jdbc.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@WebAppConfiguration
public class DBConnectionTest {

	@Autowired
	SqlSession sqlSession;

	private static String EC2_MYSQL_SERVER_IPV4 = "13.124.123.120";

	@Test
	public void dbConnectionTest() throws SQLException {
		Connection conn = (Connection) sqlSession.getConnection();

		// DB connection���� Ȯ�� ( ���н� connection is null )
		System.out.println(conn);
		assertThat(conn, notNullValue());

		// ����� AWS EC2 ipv4 Ȯ�� <= conn.getHost() ���� ����
		System.out.println("����� DB ipv4 : " + conn.getHost());
		assertThat(EC2_MYSQL_SERVER_IPV4.equals(conn.getHost()), is(true));
	}

}