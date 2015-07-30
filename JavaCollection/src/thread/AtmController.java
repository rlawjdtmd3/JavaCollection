package thread;

public class AtmController {
	public static void main(String[] args) {
	
		Atm atm = new Atm();
		/*
		 * 인터페이스타입 객체 = new 임플리먼트클래스이름();
		 * */
		Runnable kim = new AtmUser(atm, "김유신");   //AtmUser는 Atm을 사용하는 사용관계임 Atm 쓰는것 확인..
												   // 상속도아니고 구현도아니고 .. 단순 사용관계
		Runnable lee = new AtmUser(atm, "이순신");
		Runnable kang = new AtmUser(atm, "강감찬");
		Runnable hong = new AtmUser(atm, "홍길동");
		
		//디자인 패턴(23) : 데코레이션 패턴 ,,다 똑같은데 파라미터에따라 달라지더라 
		//케잌 + 과일  => 과일케잌
		//케잌 + 초콜릿 => 초코케잌
		Thread t1 = new Thread(kim);
			// 스레드에 파라미터로 kim이라는 객체를 올려놈 .. 김씨스레드가됨 
				// 스레드는케잌 이미만들어진로직 kim을 사용한다고했자나 그래서 kim을 올려놓으니깐 이스레드는 김씨스레드가됨
		t1.start(); //스타트를 호출하면 run호출함 ..콜백메소드형태, start()를 호출해야 콜백메소드인 run()을 호출한다.
		Thread t2 = new Thread(lee);
		t2.start();
		Thread t3 = new Thread(kang);
		t3.start();
		Thread t4 = new Thread(hong);
		t4.start();
		
		  //이렇게하면 동시접속자 4  ,, MaxActive : 4 
	}
}
