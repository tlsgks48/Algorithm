package programmers_level0;

public class 최댓값만들기 {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i] * numbers[j] > answer) answer = numbers[i] * numbers[j];
            }
        }

        return answer;
    }
}
