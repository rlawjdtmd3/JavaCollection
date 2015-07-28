package util.vector;

import java.util.Scanner;

/*
 * @ Date : 2015.07.27
 * @ Author : me
 * @ Story : 
 * */
public class GradeController {
	//메인메소드가 Controller라고 주로쓰임 ..
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();               //1.객체
		//개발과정에서 테스트를 위한 임시값 : 더미값(dummy)
		Grade hong = new Grade("1301", "홍길동", 100,100,100);         //더미값들
		Grade kim = new Grade ("1302", "김유신", 50,50,50);
		Grade lee = new Grade ("1303", "이순신", 30,30,30);

		//초창기에는 이렇게하고 한명만출력 hong.tostring 이런식으로 근데 이젠 자료구조.. 벡터 
		
		
		//Grade 타입의 인스턴스(객체)인 hong이
		//서비스 인터페이스를 구현한 서비스 임플 클래스의
		//input() 메소드에 할당된다.
		service.input(hong);
		service.input(kim);
		service.input(lee);                                          //더미값들
		 
		
		// 전체 학생 성적표를 출력
		//service.printList();
		
		
		/*지시값을 전달할 스캐너*/
		Scanner scanner = new Scanner(System.in);                      //2.스캐너
		int input = 0, key = 0 ;	//선언은 while 문 밖에서                         //3.변수
		/*무한루프 엔진*/
		while (true) {
			/*메뉴판*/
			System.out.println("1.성적입력 2.성적조회(학번) 3.성적조회(이름) 4.전체성적 5.성적순나열 6. 이름순나열 0. 종료");
			
			input = scanner.nextInt();
			
			/*입력값 체크 (밸류데이션)*/
			key = inputCheck(input, 0, 6);
			if (input !=0) {
				switch (key) {
				case 1:	/*성적입력*/
					System.out.println("학번 :");
					String hakbun =scanner.next();
					System.out.println("이름 :");
					String name =scanner.next();
					System.out.println("국어 :");
					int kor = scanner.nextInt();
					System.out.println("영어 :");
					int eng = scanner.nextInt();
					System.out.println("수학 :");
					int math = scanner.nextInt();
					Grade grade = new Grade(hakbun, name, kor, eng, math);
					service.input(grade);
					break;
				case 2: /*성적조회(학번)*/	
					System.out.println("학번 :");
					System.out.println(service.searchGradeByHakbun(scanner.next()));
					break;
				case 3: /*성적조회(이름)*/
					System.out.println("이름 :");
					System.out.println(service.searchGradeByName(scanner.next()));
					break;
				case 4: /*전체성적*/
					service.printList();
					break;
				case 5: /*성적순나열*/
					service.descByTotal();
					break;
				case 6: /*이름순 나열*/
					service.ascByname();
					break;

				default: System.out.println("에러발생");
					break;
				}
			} else {
				System.out.println("시스템 종료!!");
				break;
			}
		}
		
	}
	private static int inputCheck(int input, int i, int j) {
		if (input < i || input >j) {
			System.out.println("선택메뉴에서 범위값 외의 수를 입력했습니다.");
			return 0;   //retrun 0   시스템 종료 .. 리턴타입의 디폴트값을 리턴했기떄문에  ,,int 라서 ,, String이었따면 ""을 리턴
		} else {
			return input ;
		}
	}
}

/*	##패턴##
 * 
 * while문 밖에
 * 인터페이스 구현한 (객체 + 스캐너 + 인풋변수) 3가지..장착
 * 
 * while(true){
 * 	  if(input !=0){
 * 
 * 	   }else{
 *	
 *     }
 * }
 * 
 * */
