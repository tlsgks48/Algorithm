package programmers_level1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;
        // 문제 파악 : 문자열 s가 주어질 때 숫자로 변환하라. 단 문자열 맨앞에 부호(+,-)가 올 수 있다.
        // 1. charAt 이용하여 부호 확인.
        // 2. Integer.parseInt를 사용하여 변환.
        // 3. - 부호일 경우는 substring를 이용하여 위치에 맞게 변환

        if(s.charAt(0) == '-') {
            answer = - + Integer.parseInt(s.substring(1,s.length()));
        } else {
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}
