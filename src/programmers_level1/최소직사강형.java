package programmers_level1;

import java.util.Arrays;

public class 최소직사강형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] max = new int[sizes.length];
        int[] min = new int[sizes.length];
        // 문제 파악 : 세로와 가로 길이가 담긴 2차원 배열 sizes가 주어질 때 ,
        // 가로와 세로를 모두 만족하는 넓이를 구하여 retrun하라.
        // 1. 각 배열의 가로 , 세로 길이 중 큰 값들을 한쪽으로 정렬한다.
        // 2. 각 배열의 작은 값들도 한쪽으로 정렬한다.
        // 3. 큰 값들과 작은 값들을 정렬했을 때 , 가장 큰 값들을 구한다.
        // 4. 가장 큰 값들로 넓이를 구하여 return 한다.

        for(int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
            max[i] = sizes[i][sizes[i].length-1];
            min[i] = sizes[i][0];
        }

        Arrays.sort(max);
        Arrays.sort(min);

        answer = max[sizes.length-1] * min[sizes.length-1];

        return answer;
    }
}
