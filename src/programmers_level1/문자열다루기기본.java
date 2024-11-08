package programmers_level1;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = false;
        // 문제 파악 : 문자열이 주어질 때 길이가 4 or 6이며 숫자로만 구성되어있는 체크하고 맞다면 true를 return하라.
        // 1. length()를 이용하여 길이가 4 혹은 6인지 체크한다.
        // 2. 문자열이 숫자로만 되어있는지를 확인하기 위해 정규 표현식을 이용한다.
        // 3. matches를 이용하여 숫자로만 구성되어있는지 체크하는 "^[0-9]+$" 를 이용한다.

        if((s.length() == 4 || s.length() == 6) && s.matches("^[0-9]+$")) answer = true;

        return answer;
    }
}
