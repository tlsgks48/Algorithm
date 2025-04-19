package programmers_level0;

public class 배열만들기1 {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int count = 0;

        for(int i=1; i<=n; i++) {
            if(i % k == 0) count++;
        }

        answer = new int[count];
        count = 0;

        for(int i=1; i<=n; i++) {
            if(i % k == 0) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }
}
