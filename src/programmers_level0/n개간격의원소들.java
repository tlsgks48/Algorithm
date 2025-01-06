package programmers_level0;

public class n개간격의원소들 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int sum = 0;

        if(num_list.length % n == 0) {
            answer = new int[num_list.length/n];
        } else {
            answer = new int[(num_list.length/n) + 1];
        }


        for(int i=0; i<answer.length; i++) {
            answer[i] = num_list[sum];
            sum += n;
        }

        return answer;
    }
}
