package programmers_level0;

public class 홀수vs짝수 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<num_list.length; i++) {
            if((i+1) % 2 == 0) {
                sum1 += num_list[i];
            } else {
                sum2 += num_list[i];
            }
        }

        if(sum1 >= sum2) {
            answer = sum1;
        } else {
            answer = sum2;
        }

        return answer;
    }
}
