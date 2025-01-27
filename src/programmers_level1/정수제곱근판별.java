package programmers_level1;

import static java.lang.Double.valueOf;

public class 정수제곱근판별 {

    public long solution(long n) {
        long answer = 0;

        double result = Math.sqrt(n);

        if(result % 1 == 0.0) {
            result = Math.pow(result+1,2);
            answer = (valueOf(result)).longValue();
        } else {
            answer = -1;
        }

        return answer;
    }

}
