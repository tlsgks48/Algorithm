package programmers_level0;

public class 짝수의합 {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++) {
            if(i % 2 == 0) answer += i;
        }

        return answer;
    }
}
