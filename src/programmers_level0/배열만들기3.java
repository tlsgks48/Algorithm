package programmers_level0;

public class 배열만들기3 {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int j = 0;

        answer = new int[(intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1)];

        for(int i = intervals[0][0]; i<=intervals[0][1]; i++) {
            answer[j] = arr[i];
            j++;
        }

        for(int i = intervals[1][0]; i<=intervals[1][1]; i++) {
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }
}
