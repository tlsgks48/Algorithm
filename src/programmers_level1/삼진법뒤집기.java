package programmers_level1;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toString(n,3);
        // 문제 파악 : 자연수 n이 주어질때 , n을 3진법으로 만들고 뒤집은 후 다시 10진법으로 변환하여 return하라.
        // 1. Integer.toString(int,3)을 이용하여 n을 3진법으로 만든다.
        // 2. 이제 뒤집기 위해서 StringBuilder에 대입 후 reverse()를 이용하여 문자열을 뒤집는다.
        // 3. 이제 뒤집은 3진법을 Integer.parseInt(String,3)을 이용하여 10진법으로 변환 후 return.

        StringBuilder sb = new StringBuilder(binary);
        sb.reverse();

        answer = Integer.parseInt(sb.toString(),3);

        return answer;
    }
}
