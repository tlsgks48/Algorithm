package programmers_level0;

public class A강조하기 {
    public String solution(String myString) {
        String answer = "";

        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'a') {
                answer += "A";
            } else {
                if(myString.charAt(i) == 'A') {
                    answer += "A";
                } else {
                    answer += "" + Character.toLowerCase(myString.charAt(i));
                }

            }

        }

        return answer;
    }
}
