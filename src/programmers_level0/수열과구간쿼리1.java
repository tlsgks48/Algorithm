package programmers_level0;

public class 수열과구간쿼리1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        answer = arr;

        for(int a=0; a<queries.length; a++) {
            for(int i=queries[a][0]; i<=queries[a][1]; i++) {
                answer[i] += 1;
            }
        }

        return answer;
    }
}
