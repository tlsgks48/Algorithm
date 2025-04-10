package programmers_level0;

public class ad제거하기 {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int count = 0;

        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].contains("ad")) count++;
        }

        answer = new String[strArr.length-count];
        count = 0;

        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answer[count] = strArr[i];
                count++;
            }
        }

        return answer;
    }
}
