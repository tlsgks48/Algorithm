package programmers_level0;

public class 접미사인지확인하기 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        String balance = "";

        for(int i=0; i<my_string.length(); i++) {
            balance = "";
            for(int j=i; j<my_string.length(); j++) {
                balance += "" + my_string.charAt(j);
            }
            if(is_suffix.equals(balance)) answer = 1;
        }

        return answer;
    }
}
