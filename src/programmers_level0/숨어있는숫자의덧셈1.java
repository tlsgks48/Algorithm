package programmers_level0;

public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = 0;

        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            int asccode = (int)c;
            String str1 = "" + c;
            if(asccode >= 48 && asccode <=57) answer += Integer.parseInt(str1);
        }

        return answer;
    }
}
