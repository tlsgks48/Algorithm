package programmers_level0;

public class 주사위게임2 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if((a + b + c) % a == 0) {
            answer = (a + b + c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
        } else {
            if((a - b == 0) || ((b - c) == 0) || ((a - c) == 0)) {
                answer = (a + b + c) * ((a*a) + (b*b) + (c*c));
            } else {
                answer = a + b + c;
            }
        }

        return answer;
    }
}
