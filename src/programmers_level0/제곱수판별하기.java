package programmers_level0;

public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 2;

        for(int i=0; i<n/10; i++) {
            if((i*i) == n) answer = 1;
        }

        return answer;
    }
}
