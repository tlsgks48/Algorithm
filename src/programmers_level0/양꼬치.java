package programmers_level0;

public class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;

        answer += n * 12000;

        if(n > 9) {
            answer += k * 2000 - (n/10 * 2000);
        } else {
            answer += k * 2000;
        }

        return answer;
    }
}
