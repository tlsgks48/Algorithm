package programmers_level0;

public class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i] == n) answer++;
        }

        return answer;
    }
}
