package programmers_level0;

public class 칠의개수 {
    public int solution(int[] array) {
        int answer = 0;
        // 문제 파악 : 정수 배열 array의 원소들 중에 7이 총 몇개인지?
        // 1. array의 길이만큼 for문으로 순회
        // 2. 배열의 각 원소를 나머지 10 으로 7인지 확인 , 맞다면 answer++
        // 3. while문으로 0보다 클동안 나누기 10으로 반복

        for(int i=0; i<array.length; i++) {
            while(array[i] > 0) {
                if(array[i]%10 == 7) answer++;

                array[i] /= 10;
            }
        }

        return answer;
    }
}
