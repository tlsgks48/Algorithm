package programmers_level0;

public class 부분문자열인지확인하기 {
    public int solution(String my_string, String target) {
        int answer = 0;

        if(my_string.contains(target)) answer = 1;

        return answer;
    }
}
