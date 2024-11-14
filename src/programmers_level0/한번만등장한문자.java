package programmers_level0;

import java.util.ArrayList;
import java.util.Comparator;

public class 한번만등장한문자 {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        // 문제 파악 : 문자열 s가 주어질 때 s에서 한번만 등장하는 문자를 사전순으로 정렬한 문자열을 return하라.
        // 1. 한번만 등장하는 문자열을 저장하기 위해 ArrayList 생성.
        // 2. 문자열 s의 길이만큼 for문을 순회하여 각 위치의 문자를 검사할 준비를한다.
        // 3. 두번째 for문을 생성하여 처음부터 각 자리의 문자가 2개 이상인지 체크한다.
        // 4. 한번만 등장하는 문자를 ArrayList에 add한다.
        // 5. for문 종료후 더해진 ArrayList의 문자를 정렬을 적용한 후 더한뒤 return.

        ArrayList<String> al = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            count = 0;
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && i != j) count++;
                if(count > 0) break;
            }

            if(count == 0) al.add(""+s.charAt(i));
        }

        al.sort(Comparator.naturalOrder());

        for(int i=0; i<al.size(); i++) {
            answer += al.get(i);
        }

        return answer;
    }
}
