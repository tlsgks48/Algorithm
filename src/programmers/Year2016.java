package programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Year2016 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		// 문제 : 2016년 a월 b일은 무슨요일 일까? 두 수 a,b를 입력받아 2016년 a월 b일이 무슨요일인지 리턴하는 문자열 함수 solution을 완성하라.
		
		// 1. 2016년은 윤년임. 2. 첫번째로 달력을 불러와야함.
		
		 String answer = "", aa="02", bb="11";
		 int a=5, b=24;
		 String[] Mon = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		 String[] Day = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		 
		 Date date = null;
		try {
			date = formatter.parse("2016"+Mon[a-1]+Day[b-1]);
		} catch (ParseException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}  // 날짜 입력하는곳 .
		 date = new Date(date.getTime());  // 날짜값
		 
		 Calendar cal = Calendar.getInstance() ;
		 cal.setTime(date);              // 하루더한 날자 값을 Calendar  넣는다.
		 
		 int dayNum = cal.get(Calendar.DAY_OF_WEEK);   // 요일을 구해온다. 
		 
		 
		 
		 switch (dayNum ) {
	     case 1: answer = "SUN"; break;
	     case 2: answer = "MON"; break;
	     case 3: answer = "TUE"; break;
	     case 4: answer = "WED"; break;
	     case 5: answer = "THU"; break;
	     case 6: answer = "FRI"; break;
	     case 7: answer = "SAT"; break;
	 }
		 System.out.println(dayNum);
		 System.out.println(answer);
		 System.out.println("2016"+aa+bb);
		 
	}

}
