package programmers_level0;

public class 두수의연산값비교하기 {
    public int solution(int a, int b) {
        int answer = b;
        int sum1 = a;
        int sum2 = 2 * a * b;
        int count = 0;

        while(answer > 0) {
            answer /= 10;
            count++;
        }

        while(count > 0) {
            sum1 *= 10;
            count--;
        }

        sum1 += b;

        answer = sum2;

        if(sum1>sum2) answer = sum1;

        return answer;
    }
}
