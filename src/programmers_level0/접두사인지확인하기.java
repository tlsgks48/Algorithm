package programmers_level0;

public class 접두사인지확인하기 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String eq = "";

        for(int i=0; i<my_string.length(); i++) {
            eq += "" + my_string.charAt(i);
            if(eq.equals(is_prefix)) answer = 1;
        }

        return answer;
    }
}
