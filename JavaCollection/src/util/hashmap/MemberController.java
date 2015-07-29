package util.hashmap;
/*
 * @ Date : 2015.07.29
 * @ Author : me
 * @ Story : 
 * */
import java.util.Scanner;

public class MemberController {
	
	public static void main(String[] args) {
		//커맨드 패턴
		
		
		MemberService service = new MemberServiceImpl();
		Scanner scanner = new Scanner(System.in);
		String input = "" ;//거의 URL 이 오기때문에 String
		// 이 3가지가 while문밖에 있어야되는 공식
		
		while (true) {
			System.out.println("[JOIN]  회원가입, [LOGIN]  로그인 , [LOGOUT] 로그아웃");
			input = scanner.next();
			
			if (input.equals("logout")) {
				System.out.println("로그아웃!!");
				service.logout();
				break;
				
			} else {
				switch (input) {
				case "join": 
					System.out.println("회원가입");
					System.out.println("ID :");
					String userid = scanner.next();
					System.out.println("비밀번호 :");
					String password = scanner.next();
					System.out.println("이름 :");
					String name = scanner.next();
					System.out.println("나이 :");
					int age = scanner.nextInt();
					System.out.println("주소 :");
					String address = scanner.next();
					service.join(userid, password, name, age, address);
					System.out.println("회원가입 축하");
					break;
				case "login":
					System.out.println("로그인");
					System.out.println("ID :");
					String userid2 = scanner.next();
					System.out.println("비밀번호 :");
					String password2 = scanner.next();
					//service.login(userid2, password2);
					String result = service.login(userid2, password2); //리턴값이 생겨서 앞에 담을 형식을 정해줌.
					String flag = result.substring(0,5);  //첫번쨰인덱스부터 5미만까지 5글자 (0,1,2,3,4) 잡아내는 grab 같은
					
					if (flag.equals("환영합니다")) {
						System.out.println(result);
						break; //로긴성공하면 무한루프 스톱 
					} else if(flag.equals("비번이 다")){
						
					} else{
						
					}
					
					
					
				
				default:
					System.out.println("잘못입력");
					break;
				}
			}
		}
	}
}
