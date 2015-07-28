package util.vector;

import java.util.Vector;

/*
 * @ Date : 2015.07.27
 * @ Author : me
 * @ Story : 
 * */
public interface GradeService {
	// 인터페이스는 추상메소드만 존재한다
	// 따라서 abstract를 생략해도 디폴트로 존재한다 .. 이게추상클래스와 인터페이스의 차이
	

	// 성적표를 컬렉션에 "입력"
	public void input(Grade grade);
	
	// 학생들 전체 성적표 출력
	public void printList();
	
	// 학번으로 성적결과 조회(검색)
	public String searchGradeByHakbun(String hakbun);
	
	// 이름으로 성적결과 조회(검색)
	public Vector<Grade> searchGradeByName(String name);

	//총점 역순 정렬
	public void descByTotal();
	
	//이름 오름차순 정렬(ㄱ,ㄴ,ㄷ....)
	public void ascByname();

}

