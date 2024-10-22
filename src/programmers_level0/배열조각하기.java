package programmers_level0;

import java.util.ArrayList;
import java.util.List;

public class 배열조각하기 {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int n = 0;
        List<Integer> arrList = new ArrayList<>();

        for(int element : arr) {
            arrList.add(element);
        }

        for(int i=0; i<query.length; i++) {
            n = arrList.size();
            if(i%2 == 0) {
                for(int j=query[i]+1; j<n; j++) {
                    arrList.remove(query[i]+1);
                }
            } else {
                for(int j=0; j<query[i]; j++) {
                    arrList.remove(0);
                }
            }
        }

        answer = new int[arrList.size()];
        for(int j=0; j<arrList.size(); j++) {
            answer[j] = arrList.get(j);
        }

        return answer;
    }
}
