package util.hashmap;
/*
 * @ Date : 2015.07.29
 * @ Author : me
 * @ Story : 
 * */
public interface MemberService {
	
	
	public void join(String userid, String password,String name,int age,String address);
	
	public String login(String userid2, String password2);
	
	public void logout();
	
	
}
