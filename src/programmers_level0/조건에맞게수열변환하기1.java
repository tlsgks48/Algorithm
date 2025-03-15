package programmers_level0;

public class 조건에맞게수열변환하기1 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        answer = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < 50) {
                if(arr[i] % 2 == 1) {
                    answer[i] = arr[i]*2;
                } else {
                    answer[i] = arr[i];
                }
            } else {
                if(arr[i] % 2 == 0) {
                    answer[i] = arr[i]/2;
                } else {
                    answer[i] = arr[i];
                }
            }

        }

        return answer;
    }
}
