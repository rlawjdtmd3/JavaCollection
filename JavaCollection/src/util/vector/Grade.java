package util.vector;
/*
 * @ Date : 2015.07.27
 * @ Author : me
 * @ Story : 
 * */
public class Grade {
	
	/*=== 필드 ===*/
	private int kor, eng, math ;
	private String hakbun, name;
	
	/*=== 생성자 ===*/
		
	public Grade() {} //파라미터없는게 하나필요 
					  // 아래처럼파라미터가 있는 생성자를 만들면 디폴트를 별도로 추가해 줘야 함 ..
	
	
	
	//setter 대신에 생성자로 학번,이름,3과목점수를 입력받음 ,,
	public Grade(String hakbun, String name , int kor , int eng, int math) {
	
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	/*=== 멤버메소드 ===*/

	 	//getTotal 메소드를 직접 생성
	 	//파라미터로 국어 , 영어 ,수학
		//리턴값으로 파라미터 값의 합계

	public int getTotal(){     // total은 연산결과이고 입력받는값이 아니기때문에 굳이 인스턴스변수로 주지않아도됨 ..
		int total = 0 ;
		total = this.kor + this.eng + this.math ;
		return total;
	}

	/*
	 * 이런식으로 메소드 이름이 같음에도 불구하고
	 * 파라미터 갯수나 혹은 타입이 다르면
	 * 서로 다른 메소드로 인식한다.
	 * 이를 객체지향 4대 특징중 하나인 다양성에서
	 * "오버로딩"이라고 말한다.
	 * 주의  !! 오버라이딩은 상속관계, 구현관계에서 
	 * @Override 라고 붙은 메소드를 말함 
	 * 
	 * 오버로딩은 서로 메소드이름이 똑같은
	 * 오버라이딩은 부모 인터페이스와 메소드이름이 똑같은
	 * */
	
	public int getTotal(int kor , int eng , int math){ //파라미터로 넘어온애들은 메인에서 선언하는 ..    
		int total = 0 ;
		total = kor + eng + math ;
		// 위 kor, eng , math 는 this를 지움으로써
		// 멤버필드에 인스턴스 변수가 아닌
		// 파라미터로 넘어온 지역변수가 되었다.
		return total;
	}
	// gettotal 둘다맞음 기능의차이는없음 .. 아래것이 확장성은좋아보임 .. 인스턴스변수를안써서 ...?
	
	
	@Override
	public String toString() {
		
		
		return "성적표 [이름 : "+name+" , 학번 : "+hakbun+", ]\n"
				+"국어 : "+kor+" , 영어 : "+eng+" , 수학 : "+math+" \n"
				+"총합 : "+getTotal(kor , eng , math)+"\n"; // 파라미터받는애로 썻으면 적어주고 아니면안적고
	}



	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	

}
