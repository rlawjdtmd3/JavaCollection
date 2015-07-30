package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : me
 * @ Story : 
 * */

//singleton이라는 빈을 하나만들었어요
//getInstance(); 인터페이스에 구현
public class Singleton {
	
	//@@필드
	
	//지금까지는 컨트롤러에 서비스를 객체로 만들어쓴ㄴ데
	//이젠  필드에다가 내가 나로에해서 내인스턴스를 미리 만드는개념
	private static Singleton singleton = new Singleton();     
	
					//private로 은닉화 .. static도 붙여서 아래 멤버메소드에서 부를때 static Singleton 이렇게 부름
		   			//private안하면 new가 풀려버림 막만들수 있게됨 ..
	
	
	//@@생성자
	
	private Singleton() { //싱글톤에서는 생성자를 private으로 은닉화 시킨다 .. 
							//이렇게만들어버리면 다른데서 new를 쓸수 없음 ..
	
		System.out.println("인스턴스 생성"); //이건예제라 넣어준거고
		
	}
	
	//@@멤버메소드
	public static Singleton getInstance(){ //리턴타입이 singleton  static singleton . 접근하게적어준것
		
		//Singleton singleton = null;
		return singleton;  //지역변수찾고 없으면.. 인스턴스변수찾고
				//인스턴스를 return 해서 계속 쓰게끔 .. 
				// 나외엔 다른사람은 접속못하게 하는게 singleton 패턴
				// private를 public으로 바꾸는게 해킹 .. 
	}
	
}

// 싱글톤패턴만드는 방법
//1.필드에 나자신 나자신클래스의 타입으로 하는 객체를 미리만듦 ,, 남이만들게 두지않고
//2.new를 쓰지못하도록 생성자를 private로 은닉화시킨다.
//3.멤버메소드