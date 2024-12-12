package programmers_level0;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        answer = new int[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
