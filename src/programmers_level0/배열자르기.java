package programmers_level0;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int a = 0;
        answer = new int[num2 - num1 + 1];

        for(int i=num1; i<=num2; i++) {
            answer[a] = numbers[i];
            a++;
        }

        return answer;
    }
}
