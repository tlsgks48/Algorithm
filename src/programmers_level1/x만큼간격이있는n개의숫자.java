package programmers_level1;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = {};
        long a = 0;
        // 문제 파악 : 정수 x와 자연수 n이 주어질때 x부터 x씩 증가하여 n개를 answer 배열에 저장하여 return 하라.
        // 1. n개만큼 answer 배열에 크기 선언.
        // 2. n개만큼 for문 순회.
        // 3. 범위가 크니 long타입 a를 만들어서 x씩 더하는 변수 선언.
        // 4. a씩 더한걸 배열에 저장하고 return.

        answer = new long[n];

        for(int i=0; i<n; i++) {
            a += x;
            answer[i] = a;
        }

        return answer;
    }
}
