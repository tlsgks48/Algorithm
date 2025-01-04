package programmers_level1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        int a = 0;

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) a = i;
        }

        answer = "김서방은 " + Integer.toString(a) + "에 있다";

        return answer;
    }
}
