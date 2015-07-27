package util.vector;
/*
 * @ Date : 2015.07.27
 * @ Author : me
 * @ Story : 
 * */
public class GradeController {
	//메인메소드가 Controller라고 주로쓰임 ..
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		Grade hong = new Grade("1301", "홍길동", 100,100,100);
		Grade kim = new Grade ("1302", "김유신", 50,50,50);
		Grade lee = new Grade ("1303", "이순신", 30,30,30);

		//초창기에는 이렇게하고 한명만출력 hong.tostring 이런식으로 근데 이젠 자료구조.. 벡터 
		
		
		//Grade 타입의 인스턴스(객체)인 hong이
		//서비스 인터페이스를 구현한 서비스 임플 클래스의
		//input() 메소드에 할당된다.
		service.input(hong);
		service.input(kim);
		service.input(lee);
		
		
		// 전체 학생 성적표를 출력
		service.printList();
		
	}
}
