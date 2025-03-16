package programmers_level1;

public class 푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";

        for(int i=0; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                answer += Integer.toString(i);
            }
        }

        answer += Integer.toString(0);

        for(int i=food.length-1; i>0; i--) {
            for(int j=0; j<food[i]/2; j++) {
                answer += Integer.toString(i);
            }
        }

        return answer;
    }
}
