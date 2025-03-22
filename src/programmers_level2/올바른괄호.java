package programmers_level2;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                count += 1;
            } else if (s.charAt(i) == ')' && count > 0) {
                count -= 1;
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("올바른 괄호");

        if(count == 0 && s.length() % 2 == 0) answer = true;

        return answer;
    }
}
