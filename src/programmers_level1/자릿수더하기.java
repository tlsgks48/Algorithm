package programmers_level1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        // 문제 파악 : 자연수 N이 주어지면 각 자릿수의 합을 구하여 return하라.
        // 1. N이 456이면 각 자릿수 4 + 5 + 6 을 더하면 됨.
        // 2. %와 /을 이용하여 while문을 사용하여 각 자랏수를 구한다.
        // 3. n이 0보다 클동안 반복하여 n%10 활용하여 끝자리수를 구한다.
        // 4. 끝자리수를 구하면 나누기 10을 하여 계속 반복.
        // 5. 계속 나누다가 결국 0이 되면 각 자릿수 더한걸 return.

        while(n > 0) {
            answer += (n%10);
            n /= 10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
