package programmers_level0;

public class 아이스아메리카노 {
    public int[] solution(int money) {
        int[] answer = {};

        answer = new int[2];

        while(money > 0) {
            if(money >= 5500) {
                answer[0] += 1;
                money -= 5500;
            } else {
                break;
            }
        }

        answer[1] = money;

        return answer;
    }
}
