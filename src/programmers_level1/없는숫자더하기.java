package programmers_level1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;

        for(int i=0; i<10; i++) {
            count = 0;
            for(int j=0; j<numbers.length; j++) {
                if(numbers[j] == i) count = 1;
            }
            if(count == 0) answer += i;
        }

        return answer;
    }
}
