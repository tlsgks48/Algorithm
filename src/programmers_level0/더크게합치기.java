package programmers_level0;

public class 더크게합치기 {
    public int solution(int a, int b) {
        int answer = 0;

        int sum1 = a;
        int sum2 = b;
        int count = 0;

        while(a > 0) {
            a /= 10;
            count++;
        }
        a = sum1;

        sum1 += (int)(Math.pow(10,count) * b);

        count = 0;
        while(b > 0) {
            b /= 10;
            count++;
        }

        sum2 += (int)(Math.pow(10,count) * a);

        answer = sum2;

        if(sum1 > sum2) answer = sum1;

        return answer;
    }
}
