package util.hashmap;
/*
 * @ Date : 2015.07.29
 * @ Author : me
 * @ Story : 
 * */
public interface MemberService {
	
	
	public void join(String userid, String password,String name,int age,String address);
	
	public String login(String userid2, String password2);
	
	//public void logout(); // 로그아웃은 단순히  break로 빠져나가면되기에 ...
							// 단순히 연산을 빠져나가서(for? while ?, if ?) 그객체를 지워버리면 되기떄문에 따로 구현할 필요가 없음 ..
	
	
}
