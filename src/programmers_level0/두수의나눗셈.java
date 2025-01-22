package programmers_level0;

public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double sum = 0;

        sum = ((double)num1 / (double)num2) * 1000;

        answer = (int)sum;

        return answer;
    }
}
