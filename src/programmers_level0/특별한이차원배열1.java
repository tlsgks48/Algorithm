package programmers_level0;

public class 특별한이차원배열1 {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        int count = 0;

        for(int i=0; i<n; i++) {
            answer[i][count] = 1;
            count++;
        }

        return answer;
    }
}
