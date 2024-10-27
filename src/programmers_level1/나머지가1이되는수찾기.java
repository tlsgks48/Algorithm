package programmers_level1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;
        int i = 2;
        // 문제 파악 : n을 나누고 나머지가 1이되는 가장 작은 자연수 x를 구하라.
        // 1. while문을 이용하여 2부터 시작 , 나머지를 이용하여 1이 되는지 체크한다.
        // 2. 나머지가 1이되면 break 및 answer 에 대입 후 return.

        while(i > 1) {
            if(n % i == 1) {
                answer = i;
                break;
            }
            i++;
        }

        return answer;
    }
}
