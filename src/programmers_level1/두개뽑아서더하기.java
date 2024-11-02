package programmers_level1;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> result = new ArrayList<Integer>();
        // numbers배열에 있는것들을 하나씩 순차적으로 다 더해보자.
        for(int i=0; i<numbers.length; i++) {
            if(i>0) {
                for(int j=0; j<numbers.length; j++) {
                    if(i!=j) {
                        result.add(numbers[i] + numbers[j]);
                    }

                }
            }else {
                for(int j=1; j<numbers.length; j++) {
                    result.add(numbers[i] + numbers[j]);
                }
            }
        }
        // 정렬하고 중복값 삭제.
        Collections.sort(result);
        for(int a=0; a<result.size(); a++) {
            for(int b=a+1; b<result.size(); b++) {
                if(result.get(a).equals(result.get(b))) {
                    result.remove(b);
                    b--;
                }

                if(result.get(a) < result.get(b)) {
                    b = result.size();
                }
            }
        }

        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
