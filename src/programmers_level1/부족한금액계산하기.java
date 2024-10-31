package programmers_level1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        // 문제 파악 : 놀이기구 이용료의 가격 price , 보유 머니 monet , 이용 횟수 count가 주어질 시
        // 놀이기구를 count번 타게되면 금액이 얼마가 모자라는지 return.
        // 놀이기구 이용료는 N번째 이용한다면 이용료가 N배 인상된다.
        // 1. count만큼 for문 순회
        // 2. answer에 price * i 금액을 누적시킨다.
        // 3. 조건에 따라 answer 값이 money보다 작으면 0을 , 크면 answer - money 를 return.

        for(int i=1; i<=count; i++) {
            answer += price * i;
        }

        if(answer <= money) {
            answer = 0;
        } else {
            answer -= money;
        }

        return answer;
    }
}
