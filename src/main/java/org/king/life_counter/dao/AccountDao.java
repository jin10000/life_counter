package org.king.life_counter.dao;

import java.util.List;

import org.king.life_counter.vo.Account;

public interface AccountDao {
	
	// account에 존재하는 userId를 기반으로 모든 목록 가져오기
	public List<Account> selectAccount(Account account);
	// account 추가하는거
	public int insertAccount(Account account);
	
	// account 추가하는거
	public int updateAccount(Account account);
	
	// account 추가하는거
	public int deleteAccount(Account account);
}
