package programmers_level0;

public class 문자열정수의합 {
    public int solution(String num_str) {
        int answer = 0;

        for(int i=0; i<num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }

        return answer;
    }
}
