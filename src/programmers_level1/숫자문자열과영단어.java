package programmers_level1;

public class 숫자문자열과영단어 {
    public int solution(String s) {
        int answer = 0;
        String neo = s;
        String[] sa = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        // 문제 파악 : 숫자 혹은 문자열로 이루어진 s가 주어질 떄 각 숫자에 대응되는 영단어를 숫자로 바꾸고 return하라.
        // 1. 영단어를 숫자로 바꿀수 있는 문자열 배열 sa를 생성 ("zero" , "one" 등)
        // 2. sa 길이만큼 for문 순회하여 0 위치부터 영단어가 있는지 contains로 체크.
        // 3. 영단어가 포함된다면 replace로 문자열 -> 숫자로 변환.
        // 4. 숫자로 모두 변환 완료 시 parsInt를 이용하여 숫자 retrun.

        for(int i=0; i<sa.length; i++) {
            if(s.contains(sa[i])) {
                neo = s.replace(""+sa[i],""+i);
                s = neo;
            }
        }

        answer = Integer.parseInt(""+neo);

        return answer;
    }
}
