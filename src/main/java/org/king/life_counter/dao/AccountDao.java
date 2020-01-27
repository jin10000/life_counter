package org.king.life_counter.dao;

import java.util.List;

import org.king.life_counter.vo.Account;

public interface AccountDao {
	
	// account�� �����ϴ� userId�� ������� ��� ��� ��������
	public List<Account> selectAccount(Account account);
	// account �߰��ϴ°�
	public int insertAccount(Account account);
	
	// account �߰��ϴ°�
	public int updateAccount(Account account);
	
	// account �߰��ϴ°�
	public int deleteAccount(Account account);
}
