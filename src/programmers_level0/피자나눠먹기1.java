package programmers_level0;

public class 피자나눠먹기1 {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;

        while(n > 0) {
            n--;
            if(pizza == 7) answer++;
            pizza--;
            if(pizza == 0) pizza = 7;
        }

        return answer;
    }
}
