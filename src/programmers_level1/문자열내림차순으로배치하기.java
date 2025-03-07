package programmers_level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";

        char[] ca = s.toCharArray(); // String to Char Array

        Arrays.sort(ca); // Char Array 알파벳 순 정렬

        for(int i=ca.length-1; i>=0; i--) { // 역순으로 더하기
            answer += "" + ca[i];
        }

        return answer;
    }
}
