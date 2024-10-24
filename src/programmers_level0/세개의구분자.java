package programmers_level0;

import java.util.ArrayList;

public class 세개의구분자 {
    public String[] solution(String myStr) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder("");
        ArrayList<String> al = new ArrayList<>();
        // 문제 파악 : 문자열 myStr이 주어질때 문자 "a","b","c"를 구분하여 문자열을 나누어라.
        // 1. myStr 길이만큼 for문 순회하여 각 원소들이 "a","b","c" 인지 체크
        // 2. 아니라면 StringBuilder에 더하고 맞다면 리스트에 문자열 추가
        // 3. 리스트를 배열로 반환
        // 4. 리스트 크기가 0이라면 "EMPTY"를 반환

        for(int i=0; i<myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                if(sb.length() > 0) al.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(myStr.charAt(i));
            }
        }

        if(sb.length() > 0) al.add(sb.toString());

        if(al.size() > 0) {
            answer = new String[al.size()];
            for(int i=0; i<al.size(); i++) {
                answer[i] = al.get(i);
            }
        } else {
            answer = new String[1];
            answer[0] = "EMPTY";
        }

        return answer;
    }

}
