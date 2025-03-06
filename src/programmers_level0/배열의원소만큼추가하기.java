package programmers_level0;

public class 배열의원소만큼추가하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        answer = new int[sum];

        sum = 0;

        for(int j=0; j<arr.length; j++) {

            for(int t=0; t<arr[j]; t++) {
                answer[sum] = arr[j];
                sum++;
            }
        }

        return answer;
    }
}
