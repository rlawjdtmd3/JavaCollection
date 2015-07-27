package util.vector;
/*
 * 프로그램을 코딩하다 보면 
 * 자료구조를 다루는 데 있어서
 * CRUD 액션의 반복을 경험하게 됩니다.
 * Create : 입력, 생산
 * Read : 출력 , 조회
 * Update : 수정 -> 저장된 값을 수정 DB
 * Delete: 삭제 -> 완전삭제 DB, null 값으로 바꾸는 삭제
 * 지금은 create , read , null값삭제만 하고있는거라고 보면됨..
 *  
 * */
import java.util.Vector;

import javax.sql.rowset.serial.SerialArray;

/*
 * @ Date : 2015.07.27
 * @ Author : me
 * @ Story : 
 * */
public class GradeServiceImpl implements GradeService {
	//서비스란 말은 객체.. 기능클래스를 핸들링하는것을 말함 
	//객체 먼저 정의하고 .. 그객체에대한 중요기능들을 모아논 서비스 .. 그서비스를 구현한것이 서비스impl  .. 메인메소드역할이 컨트롤러
	
	//필드에 아래 메소드들이 공유할 자료구조를 뭘 쓸까 ?? 고민
	//1. ArrayList , 2. Vector , 3. Stack 4. HashMap 
	// 순서 O , 중복 O
	private Vector<Grade> vec = new Vector<Grade>(); // 꼭기억 !!! 객체하나만할꺼면 서비스 막 이렇게나눠서 하는 의미가없음 ..
	//배열은 바로 int count 부터 선언했는데... 지금은 벡터 ..자료구조
	Grade grade = new Grade(); //Grade 클래스에 디폴트 생성자를 만들어서 에러제거
	
	
	@Override
	public void input(Grade grade) {
		// 성적표 입력
		//vec[0] =hong ; 배열이라면 이렇게 ... 근데지금은 자료구조 벡터 
		//만약 자료구조로 배열을 사용했다면 vec[0] =hong ;
		vec.add(grade);  //입력
		
	}

	@Override
	public void printList() {
		// 전체출력
		System.out.println(vec.toString()); //출력
	}

	@Override
	public String searchGradeByHakbun(String hakbun) {
		// 학번으로 검색
		// msg = grade.toString();
		
		
		String msg ="";
		Grade grade = null; // 지변으로 인스턴스를 선언했으므로 초기화 해야함 ..
		
		// 인터페이스List계열의 클래스 길이는 size() 구한다.
		for (int i = 0; i < vec.size(); i++) {   //검색은 무조건 이모양 //배열은 length ,, 자료구조는 사이즈
			
			//만약 vec가 배열이라면  vec.get(i) 이렇게처리 
			String searchHakbun = vec.elementAt(i).getHakbun();
			//객체 .메소드.메소드.메소드.메소드 ..이런패턴은 반드시 return값이 있는
			//메소드들 끼리 연결시에만 가능하다.
			//이런 방식을 멧드 체인이라고 함.
			
			if (hakbun.equalsIgnoreCase(searchHakbun)) { //대소문자구분x  , 구분할거면 : equals

				String name = vec.elementAt(i).getName();
				int kor = vec.elementAt(i).getKor();   //grade 객체를리턴해서 국어점수리턴해서 kor변수에넣는
				int eng = vec.elementAt(i).getEng();
				int math = vec.elementAt(i).getMath();
				
				
				grade = new Grade(searchHakbun, name , kor , eng , math);
				msg = grade.toString();
				break; // 중간이라도 학번이 일치하면 그대로 스톱
			} else {
				msg = "조회하는 학번이 없습니다.";
			}
			
		}
		return msg;
	}

	@Override
	public void ascGradeTotal() {
		// 성적 정렬
	}
	
	//implement 코딩순서
	//1. void는 냅두고  2. 리턴값있는애들은 타입잡아서 변수하나 선언 ,, 리턴에 그변수 넣어줌 ..
	//3. 필드에 아래 메소드들이 공유할 자료구조를 뭘 쓸까 ?? 고민
		//1) ArrayList , 2) Vector , 3) Stack 4) HashMap 
	//
}
