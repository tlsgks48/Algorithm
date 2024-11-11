package programmers_level1;

import java.util.ArrayList;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;;

        ArrayList<Integer> lost2 = new ArrayList<Integer>();
        for(int i=0; i<lost.length; i++) {
            lost2.add(lost[i]);
        }
        ArrayList<Integer> reserve2 = new ArrayList<Integer>();
        for(int i=0; i<reserve.length; i++) {
            reserve2.add(reserve[i]);
        }

        for(int i=0; i<lost2.size(); i++) {
            if(reserve2.contains(lost2.get(i))) {
                reserve2.remove(lost2.get(i));
                lost2.remove(lost2.get(i));
                answer += 1;
            }
        }

        for(int i=0; i<lost2.size(); i++) {
            for(int j=0; j<reserve2.size(); j++) {
                if(lost2.get(i) == reserve2.get(j)+1 || lost2.get(i) == reserve2.get(j)-1 || lost2.get(i) == reserve2.get(j)) {
                    answer += 1;
                    lost2.remove(i);
                    reserve2.remove(j);
                    j = reserve2.size();
                    i = -1;
                }
            }
        }

        return answer;
    }
}
