package programmers_level0;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public int[] solution(String my_string) {
        int[] answer = {};
        int msLength = 0;

        String containNumberRegex = ".*\\d.*"; // 숫자를 의미하는 정규식 패턴 , [0-9]와 동일한 의미

        String[] sq = my_string.split("");

        for(int i=0; i<sq.length; i++) {
            if(sq[i].matches(containNumberRegex)) msLength++;
        }

        answer = new int[msLength];

        Arrays.sort(sq);

        msLength = 0;

        for(int i=0; i<sq.length; i++) {
            if(sq[i].matches(containNumberRegex)) {
                answer[msLength] = Integer.parseInt(sq[i]);
                msLength++;
            }
        }

        return answer;
    }
}
