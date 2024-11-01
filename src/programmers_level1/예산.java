package programmers_level1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 문제 파악 : 정수 배열 d와 정수 budget이 주어질 때 배열안에 있는 원소들의 합이
        // budget 숫자를 뛰어넘지 않는다는 조건하에 총 몇개인지 구하여라.
        // 1. 배열 d 안에 있는 숫자들을 Arrays.sort 를 이용하여 오름차순 정렬한다.
        // 2. d의 길이로 for문을 순회.
        // 3. d의 작은 원소들부터 budget보다 작거나 같으면 -를 누적시키고 카운트.
        // 4. 카운트한 answer를 return.

        Arrays.sort(d);

        for(int j=0; j<d.length; j++) {
            if(d[j] <= budget) {
                budget -= d[j];
                answer++;
            }
        }

        return answer;
    }
}
