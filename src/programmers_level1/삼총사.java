package programmers_level1;

public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;

        for(int i=0; i<number.length; i++) {
            for(int j=i+1; j<number.length; j++) {
                for(int t=j+1; t<number.length; t++) {
                    if((number[i]+number[j]+number[t]) == 0) answer++;
                }
            }
        }

        return answer;
    }
}
