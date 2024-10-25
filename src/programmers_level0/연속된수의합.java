package programmers_level0;

public class 연속된수의합 {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int mid = 0;
        int n=0;
        answer = new int[num];

        mid = total/num;

        if(num%2 == 0) {
            n = (num/2)-1;
        } else {
            n = num/2;
        }

        for(int i=0; i<num; i++) {
            answer[i] = mid-n+i;
        }

        return answer;
    }
}
