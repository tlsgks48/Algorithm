package programmers_level0;

public class 문자열곱하기 {
    public String solution(String my_string, int k) {
        String answer = "";

        while(k > 0) {
            answer += my_string;
            k--;
        }

        return answer;
    }
}
