package programmers_level0;

public class 배열의길이에따라다른연산하기 {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};

        answer = new int[arr.length];

        if(arr.length % 2 == 0) {
            for(int i=0; i<arr.length; i++) {
                answer[i] = arr[i];
                if(i % 2 == 1) answer[i] += n;
            }
        } else {
            for(int i=0; i<arr.length; i++) {
                answer[i] = arr[i];
                if(i % 2 == 0) answer[i] += n;
            }
        }

        return answer;
    }
}
