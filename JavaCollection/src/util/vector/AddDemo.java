package util.vector;
import java.util.Scanner;
/*
 * @ Date : 2015.07.24
 * @ Author : me
 * @ Story :
 * */
import java.util.Vector;

/*
 * java.util.Vector 의 메소드 중에
 * 추가 기능을 담당하는 add()
 * 
 * java.util.Vecotr 벡터의 정식명칭
 * */
public class AddDemo {
	public static void main(String[] args) {
		Vector<String> avengers = new Vector<String>();
		//원시타입(소문자시작하는 int같은거)안됨 
		
		//avengers.add("홍길동");  =  string name = scan~ 기존에 문자대입하는 방식의 문법과 동일한 결과
		
		//배열보다 훨씬좋은 벡터 .. 배열은 옛날차
		//크기가 4인 스트링 배열의 선언과 생성
		String[] heros = {"iron","thor","hulk","hawk"};
		//벡터도 배열과같은 성격을가짐 => 결국 출력은 for문으로 for문일단치고시작 하는느낌
		for (int i = 0; i < heros.length; i++) {
			avengers.add(heros[i]);
		}
		//자료구조는 저장과 검색이라는 기능을 위해
		//만들어진 클래스이다.
		//thor가 avenger 회원인지 검색 ?
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("어벤저스 회원 검색 ? 이름입력");
		String thor = scanner.next();
		if (avengers.contains(thor)) {  //contains 이렇게 검색이편함 배열이아닌 벡터라면 .. 필드에벡터를선언하고 하겟죵
			int idx = avengers.indexOf(thor);
			System.out.println(thor +"는"+(idx+1)+"번째에 있습니다");
		} else {
			System.out.println(thor+" 어벤저스 회원이 아닙니다.");
		}
		
		
		// 첫번째 요소 삭제
		avengers.remove(0); //인덱스값을 파라미터로 전달하면 삭제 완료
							// 그사람의 인덱스 번호를 넣어서 삭제
		
		
	}
}
