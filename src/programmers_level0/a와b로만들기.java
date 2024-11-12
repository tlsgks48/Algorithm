package programmers_level0;

public class a와b로만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        // 문제 파악 : 문자열 before와 after가 주어질 때 before의 모든 순서를 바꾸어서 after와 같다면 1을 return하라.
        // 1. 접근을 before의 모든 문자가 after와 같은지로 초점을 맞춘다.
        // 2. before의 길이로 for문을 순회하고 , StringBuilder(after)를 생성한다.
        // 3. StringBuilder의 길이로 이중 for문을 순회하여 같은 문자가 있다면 하나씩 삭제한다.
        // 4. 모든 for문이 종료되고 StringBuilder의 길이가 0이라면 before와 after는 같은 문자열이다.
        // 5. 같다면 1을 return한다.

        StringBuilder sb = new StringBuilder(after);

        for(int i=0; i<before.length(); i++) {
            for(int j=0; j<sb.length(); j++) {
                if(before.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    break;
                }
            }
        }

        if(sb.length() == 0) answer = 1;

        return answer;
    }
}
