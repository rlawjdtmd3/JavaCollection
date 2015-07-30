package thread;
/*
 * @ Date : 2015.07.30
 * @ Author : me
 * @ Story : 
 * */
public class SingletonController {

		public static void main(String[] args) {
			//Singleton singleton = new Singleton(); private로 선언해서 이게안됨 
			
			//클래스이름으로 바로 가져올수있다 그래서 static을 씀 ..클래스가 바로가져올수있게해야한다 .. 생성자를 만들수 없기떄문에
			Singleton singleton = Singleton.getInstance();
			Singleton singleton2 = Singleton.getInstance();
			Sample sample = new Sample();
			Sample sample2 = new Sample();
			
			
			if (singleton==singleton2 ){ //주소값의 참조가 달라야되니깐 이렇게 비교
				System.out.println("싱글톤 같다");
				
			}else {
				System.out.println("싱글톤 다르다");
			}
			if (sample == sample2) {
				System.out.println("샘플 객체 같다");
			} else {
				System.out.println("샘플 객체 다르다");
			}
			
		}
}

//singleton 패턴은 같은녀석이고     메모리점유 한개   ,, 한사람이 로그인하면 그사람에게 주어진메모리는 딱 한개 ..
//new로 만들면 할때마다 다르게 나오고   메모리점유 두개  ,, 하는만큼 계속늘어남 .. 

