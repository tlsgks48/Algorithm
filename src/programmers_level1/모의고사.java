package programmers_level1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] man = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}}; // 길이 5, 8, 10
        // 1. 문제 정답은  5가지중하나. 2. 문제수는 최대 만가지 문제로. 3. 정답 수가 같은경우 오름차순으로.
        int[] count = new int[3];  // 문제맞춘수 증가
        // 수포자 패턴들과 정답을 비교해서 맞춘수 확인하기.(반복)
        for(int j=0; j<answers.length; j++) {
            if(man[0][j%man[0].length] == answers[j]) {
                count[0]++;
            }
            if(man[1][j%man[1].length] == answers[j]) {
                count[1]++;
            }
            if(man[2][j%man[2].length] == answers[j]) {
                count[2]++;
            }
        }

        int max = Math.max(count[0],Math.max(count[1],count[2]));
        ArrayList<Integer> sort = new ArrayList<Integer>();
        if(max == count[0]) {sort.add(1);}
        if(max == count[1]) {sort.add(2);}
        if(max == count[2]) {sort.add(3);}

        answer = new int[sort.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = sort.get(i);
        }

        return answer;
    }
}
