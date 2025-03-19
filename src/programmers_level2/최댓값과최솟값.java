package programmers_level2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] sq = {};

        sq = s.split(" ");

        int[] num = new int[sq.length];

        for(int i=0; i<sq.length; i++) {
            num[i] = Integer.parseInt(sq[i]);
        }

        Arrays.sort(num);

        //answer = Integer.toString(num[0]) + " " + Integer.toString(num[sq.length - 1]);

        answer = num[0] + " " + num[sq.length - 1];

        return answer;
    }
}
