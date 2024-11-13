package programmers_level0;

public class 팩토리얼 {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        // 문제 파악 : 팩토리얼의 공식을 이용하여 n이 주어질 때
        // 팩토리얼 i를 구하고 n보다 작거나 같은 수 중 가장 큰 정수인 i를 구하여 return하라.
        // 1. 제한조건을 살펴보면 0보다 크고 3,628,800보다 작거나 같다. (10! = 3,628,800)
        // 2. 따라서 10을 기준으로 for문을 돌려 팩토리얼을 구한다.
        // 3. 10부터 --를 하여 작거나 같은 정수를 구한다.
        // 4. 작거나 같은 정수가 해당되면 가장 큰 i를 구하기 위해서 break를 사용한다.
        // 5. 해당 i를 return.

        for(int i=10; i>0; i--) {
            sum = 1;
            for(int j=i; j>0; j--) {
                sum *= j;
            }

            if(sum <= n) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
