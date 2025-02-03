package programmers_level0;

public class flag에따라다른값반환하기 {

    public int solution(int a, int b, boolean flag) {
        int answer = a - b;

        if(flag) answer = a + b;

        return answer;
    }

}
