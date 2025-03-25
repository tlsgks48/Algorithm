package programmers_level0;

public class l로만들기 {
    public String solution(String myString) {
        String answer = "";
        int asciiCodeL = 108;

        for(int i=0; i<myString.length(); i++) {
            if((int)myString.charAt(i) > asciiCodeL) {
                answer += "" + myString.charAt(i);
            } else {
                answer += "l";
            }
        }


        return answer;
    }
}
