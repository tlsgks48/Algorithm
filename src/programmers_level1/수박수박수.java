package programmers_level1;

public class 수박수박수 {
    public String solution(int n) {
        String answer = "";
        // 문제 파악 : 길이가 n인 정수가 주어질 떄 2를 기준으로 "수박"을 return 하라.
        // 1. 짝수를 기준으로 "수박"이 추가되니 n/2만큼 for문을 순회.
        // 2. 순회하는 동안 "수박"을 더한다.
        // 3. 나머지를 이용하여 n이 홀수면 "수"를 더하고 return.

        for(int i=0; i<n/2; i++) {
            answer += "수박";
        }

        if(n % 2 == 1) answer += "수";

        return answer;
    }
}
