package programmers_level1;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        // 문제 파악 : 정수 배열 arr의 원소들을 모두 더해서 평균값을 return하는 문제.
        // 1. 배열 arr의 원소들을 모두 더한다.
        // 2. arr의 길이만큼 나눠서 평균값 return.

        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }

        answer /= arr.length;

        return answer;
    }
}
