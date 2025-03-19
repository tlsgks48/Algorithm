package programmers_level0;

public class 약수구하기 {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;

        for(int i=1; i<=n; i++) {
            if(n % i == 0) count++;
        }

        answer = new int[count];

        count = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }
}
