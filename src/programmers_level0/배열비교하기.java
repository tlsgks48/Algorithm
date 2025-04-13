package programmers_level0;

public class 배열비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 1;
        int sum1 = 0;
        int sum2 = 0;

        if(arr2.length > arr1.length) answer = -1;

        if(arr2.length == arr1.length) {
            for(int i=0; i<arr1.length; i++) {
                sum1 += arr1[i];
            }

            for(int j=0; j<arr2.length; j++) {
                sum2 += arr2[j];
            }

            if(sum2 > sum1) answer = -1;
            if(sum2 == sum1) answer = 0;

        }

        return answer;
    }
}
