package programmers_level0;

public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        String fake = "";

        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                fake += "B";
            } else {
                fake += "A";
            }
        }

        if(fake.contains(pat)) answer = 1;

        return answer;
    }
}
