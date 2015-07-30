package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : me
 * @ Story : 
 * */
public class AtmUser implements Runnable {// 이미만들어진 Runnable이라는 interface를 가져다쓰는개념
										 // interface를 만드는것보다 가져다쓰는게 많음 
										 // 모듈패턴의 최정점은 interface
										 //남에것 쓰는거니깐 여기선 service 쓸필요 xx
	/*
	 * 필드에 사용자타입의 클래스(우리가만든클래스)가 있고,
	 * 아래 멤버메소드 영역에 있는 메소드가 파라미터로 이 클래스 타입의 변수를 받을 경우
	 * 이를 의존관계라 하며 
	 * - AtmUser 가 Atm 을 사용한다. 라고 표현     
	 
	 * 1.상속 2.구현 3.use 관계 중 3번쨰
	 * 객체지향에서는 클래스들끼리 관계를 맺어서
	 * 사용방법을 정의합니다.
	 * 관계에는 크게 상속 , 구현 , 의존 , 연관관계등이 있는데,
	 * 그 중 상속을  IsA
	 * 의존을 use 관계라고 합니다.
	 * 
	 * 게터세터할때 필드값이 자동으로 파라미터로 꼳히는경우 생각 
	 * 그래서 필드에 사용자타입클래스 가져다놓고 게터세터 만들면 되는데 ... 아래 run 주석보기  
	 * */
	
	Atm atm;
	String name;
	
	
	
	public AtmUser(Atm atm, String name) {   //atm유저안에 atm클래스가들어있따 ..
		this.atm = atm;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		// 스레드에서 동기화를 사용할 경우
		// get/set을 사용하지 않고
		// 무조건 ...run() 사용해야 합니다.
		//여기다가 다만들면되요 .. 게터세터 ㄴㄴ .. 굳이필요없고 생성자에 세터기능 구현하면 되니깐 ..
		// get,set 은 새로운메소드라기보단 필드를 구현한거라서 만들어도됭 ..
		atm.inchul(name);
		
	}


	
}
