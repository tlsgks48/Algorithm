package programmers_level1;

import java.util.ArrayList;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        // 문제 파악 : 정수 n이 주어질 때 1부터 n사이에 있는 소수의 개수를 return하라.
        // 1. 1은 소수가 아니다. 따라서 2부터 n까지 for문을 순회한다.
        // 2. 에라토스테네스의 체를 사용하여 이중 for문을 순회한다.
        // 3. 만약 n이 소수인지 구할 때 루트n을 구하여 루트n개의 소수를 이용한다. 그리고 소수로 나누어지지않으면 소수이다.
        // 4. 위 방법을 이용하면 일일이 모든 숫자를 순회하지 않고도 소수를 빠르게 구할 수 있다.
        // 5. 소수를 나머지를 이용하여 구하고 소수가 맞다면 ArrayList에 추가하고 반복한다.
        // 6. 모든 소수를 구햇으면 ArrayList의 길이를 return한다.

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=2; i<=n; i++) {
            answer = 0;
            for(int j=0; j<(int)Math.sqrt(i); j++) {
                if(i == 2) break;
                if(i % al.get(j) == 0) answer++;
                if(answer > 0) break;
            }

            if(answer == 0) {
                al.add(i);
            }
        }

        answer = al.size();

        return answer;
    }
}
