package util.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

/*
 * @ Date : 2015.07.29
 * @ Author : me
 * @ Story : 
 * */
public class KimYunA {
	public static void main(String[] args) {
		
		/*
		 * Map 은 인터페이스
		 * HashMap 은 Map 을 구현(implements) 한 클래스
		 * */
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		//키 값이 스트링이고 , 밸류값은 숫자인 해시맵 객체를 생성
			//자료구조에서 원시형 (소문자시작)타입은 못쓰는데 숫자를표현하기위해 Integer라는 클래스 만듦 
			//Integer.parsInt("123") ; 문자열 숫자형으로 변경하는예제 
		//List 계열은 추가 add
		//Map 계열은 추가 put
		
		
		//Integer i = new Integer(98);
		//map.put("김연아", i);
		map.put("김연아", new Integer(98)); // int 타입은 맵에 들어올 수 없다.
		map.put("아사다 마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		
		/*
		 * 디자인패턴 23가지 중에서 Iterator 패턴을 사용해서
		 * 맵의 값을 출력합니다. (하나뱅크는 커맨드패턴)
		 * */
		
		//지금까지는 객체를 생성하라고 하면 
		// Set set = new Set(); 으로 만들었는데 
		//Set, Iterator 는 이처럼(생성자를 통한 생성) 생성하지않고
		//다른 객체를 통해 리턴받는 방식으로 생성을 하고
		//이를 팩토리 패턴이라고 한다.
		// 두가지뿐 생성자로만드는것 ,,,팩토리패턴
		
		
		
		//* 1. 키와 밸류를 동시에 출력 *//
		
		Set set = map.entrySet(); //entryset으로 담고  set을 중간경로로담음 ,,
		// Iterator (순환기라는 뜻)   => 지하철 2호선   
		//내부객체를만드는 순간 iterator은 계속돌아감 검색을하기위해서 ..그리고 철로가있는상태에서 객차는 아래 while문을 만들면서 생성된다고 보면됨..
		Iterator it = set.iterator();    
		
		
		//it.hasNext()는 밸류(값)가 커서(이터레이터)다음에 있는지 없는지를 따져서 있으면 
		//while 룹을 계속 돌리고 없으면 스톱한다.
		while (it.hasNext()) {                                //while문 iterator 문법에서 따로쓰는용이 있을정도
			Map.Entry e  = (Map.Entry) it.next();
			System.out.println("참가자 :" + e.getKey() +", 점수 :" + e.getValue());
		}
		
		
		//* 2. 키만(<K,V>) 출력하는 경우 : K *//
		
		set = map.keySet();
		System.out.println("참가자 명단 :" + set);
		// set 은 toString()이 내부적으로 오버라이딩 되어있다.
		// 따라서 set.toString()하지 않아도 출력
		
		
		
		
		//* 3.밸류(<K,V>)만 출력하는 경우 : V *//
		
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0 ; //지변 디폴트 값으로 초기화
		
		//iterator 쓸때는 항상 while .. 커맨드패턴도 쓰긴하네  // 배열 벡터는 포문
		while (it2.hasNext()) {
			
			//맵 내부에서는 int가 기본형이라 올 수 없고
			//반드시 Integer(=기본형 int 의 Wrapper래퍼클래스) 타입으로 와야 한다.
			Integer i = (Integer) it2.next();
			total += i.intValue(); //각 선수들의 점수 합계
		}
		System.out.println("이번 대회 평균점수 :" + total/set.size());    //배열만length  길이를구하는건 무조건 size
		System.out.println("최고점수 :" + Collections.max(values));
		System.out.println("최저점수 :" + Collections.min(values));
		//위쪽에 있는 Collection 은 인터페이스
		//아래쪽에 있는 Collections 는 클래스
		//클래스.메소드() 이런 형태로 나오면 이메소드는 클래스메소드라고 부르고
		//다른 말로는 static method 라고 부른다. 기울임 글자
	}
}

// 모든 자료구조는 입력과 출력(검색)만 아시면되요

//담을때는 put
//동시에 set 동시출력
//키만 set
//값만 컬렉션


//맵은 한번넣어두면 훨씬더 arraylist보다 다양하게 출력이 가능함