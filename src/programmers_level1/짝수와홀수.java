package programmers_level1;

public class 짝수와홀수 {
    public String solution(int num) {
        String answer = "";
        // 문제 파악 : 정수 num이 주어질때 짝수인지 홀수인지 구분하는 문제
        // 1. 나머지(%)를 이용하여 짝수인지 홀수인지 구분.
        // 2. 짝수이면 "Even"을 , 홀수이면 "Odd" 을 return

        if(num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}
