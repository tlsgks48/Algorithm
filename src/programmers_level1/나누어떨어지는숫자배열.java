package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                al.add(arr[i]);
            }
        }

        if(al.size() > 0) {
            answer = new int[al.size()];
            for(int j=0; j<al.size(); j++) {
                answer[j] = al.get(j);
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
