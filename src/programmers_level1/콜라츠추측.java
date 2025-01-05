package programmers_level1;

public class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;

        for(int i=0; i<500; i++) {
            if(num2 == 1) break;

            if(num2 % 2 == 0) {
                num2 /= 2;

            } else {
                num2 = (num2 * 3) + 1;
            }
            answer++;
        }

        if(answer == 500) answer = -1;

        return answer;
    }
}
