package programmers_level1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        // 문제 파악 : 두 정수 left와 right가 주어질 시 left ~ right 까지의 모든 수들 중 ,
        // 약수의 개수가 짝수면 더하고 , 홀수면 뺀 뒤 retrun.
        // 1. 이중 for문을 통해 left부터 right까지의 각 수를 순회.
        // 2. 나머지를 이용하여 약수를 구하고 count를 증가시킨다.
        // 3. count가 홀수인지 짝수인지에 따라 answer에 +- 후 return.

        for(int i=left; i<=right; i++) {
            count = 0;
            for(int j=1; j<=i; j++) {
                if(i % j == 0) count++;
            }

            if(count % 2 == 1) {
                answer -= i;
            } else {
                answer += i;
            }

        }

        return answer;
    }
}
