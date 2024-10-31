package programmers_level1;

public class 행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        // 문제 파악 : 2차원 배열인 arr1 , arr2가 주어지면 두 배열의 같은 행 , 같은 열의 값을 더한 2차원 배열을 return.
        // 1. arr1의 크기로 answer 배열의 크기 선언
        // 2. 1차원 크기 및 2차원 크기로 이중 for문 순회.
        // 3. 각 배열마다 arr + arr2의 원소를 더한 후 retrun.

        answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
