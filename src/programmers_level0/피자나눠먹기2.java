package programmers_level0;

public class 피자나눠먹기2 {
    public static void main(String[] args) {
        System.out.println("시켜야하는 피자는 최소 몇판인가 : " + solution(10));
    }

    public static int solution(int n) {
        int answer = n;
        // 문제 파악 : 피자를 나눠먹을 사람의 수 n이 주어질때 , 6조각으로 이루어진 피자를 몇판 시켜야 공평하게 먹을 수 있는가?
        // 1. 사람의 수 n을 나머지 6으로 계산해서 0이 나오도록한다.
        // 2. 피자를 공평하게 먹어야하니 sum+n 을 반복한다.

        while(answer%6 != 0) {
            answer += n;
        }

        return answer/6;
    }
}
