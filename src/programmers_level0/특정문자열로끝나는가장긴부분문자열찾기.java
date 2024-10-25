package programmers_level0;

public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public String solution(String myString, String pat) {
        String answer = "";
        // 문제 파악 : myString 문자열 중 pat 문자열이 마지막으로 등장하는 위치부터 처음까지 잘라내어 return하라.
        // 1. pat 문자열이 마지막으로 등장하는 위치를 파악하기 위해 lastIndexOf 사용.
        // 2. 위치를 알았으면 substring으로 0부터 lastIndexOf까지 잘라낸다.
        // 3. 추가로 pat 문자열까지 더해주고 return.

        answer = myString.substring(0,myString.lastIndexOf(pat)) + pat;

        return answer;
    }
}
