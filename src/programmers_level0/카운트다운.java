package programmers_level0;

public class 카운트다운 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int a = 0;

        answer = new int[start_num - end_num + 1];

        for(int i=start_num; i>=end_num; i--) {
            answer[a] = i;
            a++;
        }

        return answer;
    }
}
