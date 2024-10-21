package programmers_level0;

public class 배열의길이를2의거듭제곱으로만들기 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int a = 1; // 2의 거듭제곱을 찾기 위한 변수

        // arr길이보다 크거나 같은 2의 정수 거듭제곱 찾기
        // a가 작을동안 계속 2배씩 늘어남
        for(int i = 1; i<11; i++) {
            if(arr.length <= a) break;
            a *= 2;
        }

        //  찾은 2의 거듭제곱으로 배열 생성
        answer = new int[a];

        // 마지막으로 arr배열의 값들을 그대로 answer에 복사해준다.
        for(int j=0; j<arr.length; j++) {
            answer[j] = arr[j];
        }

        return answer;
    }
}
