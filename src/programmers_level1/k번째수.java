package programmers_level1;

import java.util.ArrayList;
import java.util.Collections;

public class k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        // commands의 숫자만큼 answer설정.
        answer = new int[commands.length];

        ArrayList<Integer> sort = new ArrayList<Integer>();

        for(int i=0; i<commands.length; i++) {
            sort.clear();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++) { // 규칙대로 정렬
                //System.out.println(array[j]);
                sort.add(array[j]);
            }
            Collections.sort(sort); // 정렬
            answer[i] = sort.get(commands[i][2]-1);
        }

        return answer;
    }
}
