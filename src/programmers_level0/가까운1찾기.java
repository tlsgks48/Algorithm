package programmers_level0;

public class 가까운1찾기 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i=idx; i<arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
