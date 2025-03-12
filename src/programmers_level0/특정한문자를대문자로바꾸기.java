package programmers_level0;

public class 특정한문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++) {
            if(String.valueOf(my_string.charAt(i)).equals(alp)) {
                answer += alp.toUpperCase();
            } else {
                answer += "" + my_string.charAt(i);
            }
        }

        return answer;
    }
}
