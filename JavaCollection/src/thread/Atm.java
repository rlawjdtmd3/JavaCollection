package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : me
 * @ Story : 
 * */
public class Atm {
	
	// synchronized : 동기화 키워드 (rock 거는 키워드)  
	//밑에 synchronized 메소드가 있으면 고민하지말고 위에 벡터박으면됨 .. 없으면 arraylist박으면됨..
	public synchronized void inchul(String name) {
		System.out.println(name+"이 인출 요청함");
		for (int i = 0; i < 100000000; i++) {
			if (i==1000){
				System.out.println(name + "인출 중 ...");
			}
		}
		System.out.println(name+"이 인출해 나감");
	}
}
