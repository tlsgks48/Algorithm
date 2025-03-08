package programmers_level0;

public class 대문자로바꾸기 {
    public String solution(String myString) {
        String answer = "";

        for(int i=0; i<myString.length(); i++) {
            if(Character.isUpperCase(myString.charAt(i))) {
                answer += "" + myString.charAt(i);
            } else {
                answer += "" + Character.toUpperCase(myString.charAt(i));
            }
        }

        return answer;
    }
}
