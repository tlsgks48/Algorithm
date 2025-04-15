package programmers_level0;

public class 주사위게임1 {
    public int solution(int a, int b) {
        int answer = 0;
        int count = 0;

        if(a % 2 != 0) count++;
        if(b % 2 != 0) count++;

        if(count == 2) {
            answer = (a * a) + (b * b);
        } else if (count == 1) {
            answer = 2 * (a + b);
        } else {
            answer = a - b;
            if(b>a) answer = b - a;
        }

        return answer;
    }
}
