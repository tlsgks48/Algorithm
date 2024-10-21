package programmers_level0;

public class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {
        int answer = 0;
        double sum = 1;

        for(int i=share + 1; i<=balls; i++) {
            sum *= i;
        }

        for(int j=balls - share; j>=2; j--) {
            sum /= j;
        }

        answer = (int)Math.round(sum);
        return answer;
    }

}
