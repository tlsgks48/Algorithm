package programmers_level0;

public class 홀짝에따라다른값반환하기 {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 0) {
            for(int i=1; i<=n; i++) {
                if(i % 2 == 0) answer += i*i;
            }
        } else {
            for(int i=1; i<=n; i++) {
                if(i % 2 == 1) answer += i;
            }
        }

        return answer;
    }
}
