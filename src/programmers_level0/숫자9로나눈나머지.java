package programmers_level0;

public class 숫자9로나눈나머지 {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;

        for(int i=0; i<number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        answer = sum % 9;

        return answer;
    }
}
