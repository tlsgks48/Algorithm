package programmers_level0;

import java.util.Arrays;
import java.util.Collections;

public class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = {};

        answer = new int[emergency.length];

        Integer[] counter = new Integer[emergency.length];

        for(int i=0; i<emergency.length; i++) {
            counter[i] = emergency[i];
        }

        // Collections를 이용하여 내림차순 정렬을 사용하려면 배열을 int가 아닌 원시형인 Integer를 이용
        Arrays.sort(counter, Collections.reverseOrder());

        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(emergency[i] == counter[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }

        return answer;
    }
}
