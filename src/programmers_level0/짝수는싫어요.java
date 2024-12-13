package programmers_level0;

public class 짝수는싫어요 {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        int sum = 1;

        if(n % 2 == 0) {
            count = n/2;
        } else {
            count = (n/2) + 1;
        }

        answer = new int[count];

        for(int i=0; i<count; i++) {
            answer[i] = sum;
            sum += 2;
        }

        return answer;
    }
}
