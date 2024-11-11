package programmers_level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class year2016 {
    public String solution(int a, int b) {
        String answer = "";

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

        return answer;
    }
}
