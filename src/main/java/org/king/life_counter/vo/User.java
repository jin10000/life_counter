package org.king.life_counter.vo;

public class User {
	
	private String id;
	private String pw;
	private String nickname;
	
	public User() {
		
	}
	
	public User(String id, String pw, String nickname) {
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", pw=").append(pw).append(", nickname=").append(nickname)
				.append("]");
		return builder.toString();
	}
	
}
