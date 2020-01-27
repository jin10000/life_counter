package org.king.life_counter.vo;

public class Account {
	
	private int id;
	private String userid;
	private String date;
	private String category;
	private String name;
	private int price;
	private int consumption;
	
	public Account() {
		
	}
	
	public Account(int id, String userid, String date, String category, String name, int price, int consumption) {
		this.id = id;
		this.userid = userid;
		this.date = date;
		this.category = category;
		this.name = name;
		this.price = price;
		this.consumption = consumption;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", userid=").append(userid).append(", date=").append(date)
				.append(", category=").append(category).append(", name=").append(name).append(", price=").append(price)
				.append(", consumption=").append(consumption).append("]");
		return builder.toString();
	}
	
}
