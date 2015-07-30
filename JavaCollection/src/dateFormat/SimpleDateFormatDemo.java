package dateFormat;
/*
 * @ Date : 2015.07.30
 * @ Author : me
 * @ Story : 
 * */
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("today 출력 : " +today);
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}	
}
