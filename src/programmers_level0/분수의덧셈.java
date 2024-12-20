package programmers_level0;

public class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int a = 0;
        int b = 1;

        answer = new int[2];

        if(denom2>denom1) {
            if(denom2%denom1 == 0) {
                a = denom2/denom1;

                answer[0] = (numer1*a)+numer2;
                answer[1] = denom1*a;

            } else {
                answer[0] = (numer1*denom2)+(numer2*denom1);
                answer[1] = denom2*denom1;
            }
        } else if(denom1>denom2) {
            if(denom1%denom2 == 0) {
                a = denom1/denom2;

                answer[0] = (numer2*a)+numer1;
                answer[1] = denom2*a;

            } else {
                answer[0] = (numer1*denom2)+(numer2*denom1);
                answer[1] = denom2*denom1;
            }
        } else if (denom1 == denom2){
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        }

        for(int i=2; i<=answer[1]; i++) {
            if(answer[0]%i == 0 && answer[1]%i == 0) {
                answer[0] = answer[0]/i;
                answer[1] = answer[1]/i;
                i=1;
            }
        }

        return answer;
    }
}
