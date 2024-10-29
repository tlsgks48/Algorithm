package programmers_level1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        // 문제 파악 : 정수 x가 주어질때 x의 자릿수의 합으로 x가 나누어지는 하샤드 수를 구하라.
        // 1. while문과 나머지를 이용하여 자릿수의 합 sum을 구한다.
        // 2. sum으로 나머지가 0 되는지 확인 후 결과값 return.

        while(a>0) {
            sum += a%10;
            a /= 10;
        }

        if(x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }


        return answer;
    }
}
