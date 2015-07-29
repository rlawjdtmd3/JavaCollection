package util.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * @ Date : 2015.07.29
 * @ Author : me
 * @ Story : 
 * */
public class MemberServiceImpl implements MemberService {
	/*===필드===*/
	//Map<String,Member> map = new HashMap<String,Member>();
	//위처럼 하는것이 정석 .. JSP, DB 를 만지게 되면
	//<String, Object> 가 정석.
	//하지만 이 예제에서는 <String,String> 으로 하것습니다.
	//이유는 쉽게 가려공 합니당.
	
	Map<String,String> map = new HashMap<String,String>();
	Member member = new Member();
	String userid, password , name , address; //member가아닌 string을 쓰기떄문에 이녀석을또만듦
	int age;   //member가아닌 string을 쓰기떄문에 이녀석을또만듦
	/*===생성자===*/
		//생성자는 임플에서 안만듦 ,, 게터세터있는클래스에서 만듦

	/*===멤버 메소드===*/
	@Override
	public void join(String userid,String password,String name,int age,String address) {
		member.setUserid(userid);
		member.setPassword(password);
		member.setName(name);
		member.setAge(age);
		member.setAddress(address);
		
		map.put("userid", member.getUserid());
		map.put("password", member.getPassword());
		map.put("name", member.getName());
		map.put("age",String.valueOf(member.getAge())); //int => String 으로바꾸는 공식
		map.put("address",member.getAddress());
		
		
	}

	@Override
	public String login(String userid2, String password2) {
		//로그인은 조인과다름 조인은 ,,아무렇게나 가입이된다고보자면 ,, 로그인은 피드백 ,, 이 아이디는없습니다 이런식으로 
		// 그것이 리턴값
		String msg = "";
		if (map.get("userid").equals(userid)
				&& map.get("password").equals(password)) {   // 두 조건을 모두 충족
			
			msg= "환영합니다." + member.getAddress()+"에 사시는"+
				+member.getAge()+" 세 되시는"
				+member.getName()+" 님. ";
			
			
			
		} else if(map.get("userid").equals(userid)
				&& !map.get("password").equals(password)){ 

			msg = "비번이 다릅니다. 다시 입력하세요";
			
		} else{
			msg = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력하세요.";
		}
		return msg;
	}

	@Override
	public void logout() {
		
	}
	
	
}
