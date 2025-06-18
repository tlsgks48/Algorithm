package programmers_level0;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        int sum = hp % 5;

        if(hp >= 5) {
            answer += hp/5;
        }

        if(sum % 3 == 0) {

            answer += sum /= 3;

        } else {

            answer += (sum % 3) + (sum /= 3);

        }

        return answer;
    }
}
