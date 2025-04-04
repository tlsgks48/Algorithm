package programmers_level0;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        int multi = 1;

        for(int i : num_list) {
            sum += i;
            multi *= i;
        }

        if(multi > (sum*sum)) answer = 0;

        return answer;
    }
}
