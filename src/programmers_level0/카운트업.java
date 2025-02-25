package programmers_level0;

public class 카운트업 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int a = start_num;

        answer = new int[end_num - start_num + 1];

        for(int i=0; i<=end_num - start_num; i++) {
            answer[i] = a;
            a++;
        }

        return answer;
    }
}
