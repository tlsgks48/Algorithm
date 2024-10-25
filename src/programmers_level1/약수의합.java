package programmers_level1;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        //문제 파악 : 정수 n의 약수를 모두 더한 값을 리턴하라.
        // 1. 1부터 n까지 for문 순회
        // 2. 약수란 해당 숫자를 계속 더해서 n이 되면 약수다. 예) 9의 약수 중 3을 보면 3+3+3이면 9가됨.
        // 3. 그렇다면 약수의 숫자들을 보고 공통점을 보면 n % i == 0 일 시 약수가 된다.

        for(int i=1; i<=n; i++) {
            if(n % i == 0) answer += i;
        }

        return answer;
    }
}
