package programmers_level0;

public class 원하는문자열찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;

        if( pat.length() <= myString.length() ) {
            if(myString.toLowerCase().contains(pat.toLowerCase())) answer = 1;
        }

        return answer;
    }
}
