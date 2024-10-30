package programmers_level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        // 문제 파악 : 문자열 s가 주어질 때 s의 길이가 짝수라면 가운데 두글자를 , 홀수라면 가운데 한글자를 return.
        // 1. s의 길이가 홀수인지 짝수인지 if문과 나머지로 확인
        // 2. 홀수 일 시 charAt으로 가운데 글자 return.
        // 3. 짝수 일 시 substring으로 가운데 두글자 return.

        if( s.length() % 2 == 1) {
            answer = "" + s.charAt(s.length()/2);
        } else {
            answer = s.substring((s.length()/2) - 1 , (s.length()/2) + 1);
        }

        return answer;
    }
}
