package programmers_level1;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 1234567890;
        int inc = 0;

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length-1];

            for(int j=0; j<arr.length; j++) {
                if(count > arr[j]) count = arr[j];
            }

            for(int i=0; i<arr.length; i++) {
                if(arr[i] != count) {
                    answer[inc] = arr[i];
                    inc++;
                }

            }
        }

        return answer;
    }
}
