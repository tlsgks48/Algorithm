package programmers_level0;

import java.util.Arrays;

public class 뒤에서5등위로 {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        answer = new int[num_list.length - 5];

        Arrays.sort(num_list);

        for(int i=0; i<num_list.length - 5; i++) {
            answer[i] = num_list[i+5];
        }

        return answer;
    }
}
