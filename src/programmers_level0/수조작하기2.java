package programmers_level0;

public class 수조작하기2 {
    public String solution(int[] numLog) {
        String answer = "";
        int sum = 0;

        for(int i=0; i<numLog.length; i++) {
            if(i>0) {
                if((sum + 1) == numLog[i]) {
                    answer += "w";
                    sum += 1;
                }
                if((sum - 1) == numLog[i]) {
                    answer += "s";
                    sum -= 1;
                }
                if((sum + 10) == numLog[i]) {
                    answer += "d";
                    sum += 10;
                }
                if((sum - 10) == numLog[i]) {
                    answer += "a";
                    sum -= 10;
                }
            } else {
                sum = numLog[i];
            }
        }

        return answer;
    }
}
