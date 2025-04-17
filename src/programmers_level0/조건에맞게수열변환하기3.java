package programmers_level0;

public class 조건에맞게수열변환하기3 {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};

        answer = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            if(k % 2 == 0) {
                answer[i] = arr[i]+k;
            } else {
                answer[i] = arr[i]*k;
            }
        }


        return answer;
    }
}
