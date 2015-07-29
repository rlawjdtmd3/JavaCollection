package util.hashmap;
/*
 * @ Date : 2015.07.29
 * @ Author : me
 * @ Story : 
 * */
public class Member {

	private String userid, password, name , address ;
	private int age ;
	

	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String userid , String password , String name , int age, String address) {
		this.userid = userid ;
		this.password = password;
		this.name = name;
		this.age = age;
		this.address = address ;
	}

	public String getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
