package programmers_level0;

public class 인덱스바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++) {
            if (i == num1) {
                answer += "" + my_string.charAt(num2);
            } else if (i == num2) {
                answer += "" + my_string.charAt(num1);
            } else {
                answer += "" + my_string.charAt(i);
            }

        }

        return answer;
    }
}
