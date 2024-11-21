package programmers_level0;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        int i = 1;
        // 문제 파악 : 정수 num과 k가 주어질 때 num의 숫자중 k가 있으면 그 위치에 있는 자리수를 return하라.
        // 예시) num : 232443 , k : 4 주어질 시 return : 4 (왼쪽부터 기준이며 여러개면 가장 처음 숫자)
        // 1. 숫자의 자리수를 구하는 문제이므로 while문과 나머지를 이용하여 각 자릿수를 구한다.
        // 2. 나머지를 이용하여 각 자리수를 구하고 num의 총 자리수와 k가 어느 위치에 있는지 활용하기 위해 i를 선언한다.
        // 3. 일치하는게 없다면 -1을 일치한다면 i - answer로 해당 위치를 return한다.

        while(num > 0) {
            if(num % 10 == k) answer = i;
            num /= 10;
            i++;
        }

        if(answer == 0) {
            answer = -1;
        } else {
            answer = i - answer;
        }

        return answer;
    }
}
