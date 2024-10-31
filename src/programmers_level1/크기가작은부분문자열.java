package programmers_level1;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        // 문제 파악 : 숫자로 된 문자열 t와 p가 주어질 시 , t에서 p 길이와 같은 부분 문자열을 구해서
        // 부분 문자열이 p보다 작거나 같은 숫자의 횟수를 return하라.
        // 1. t의 길이 - p의 길이 만큼 for문을 순회.
        // 2. p와 t를 숫자로 변환.
        // 3. t는 substring을 이용하여 각 부분문자열을 순회하여 변환.
        // 4. 숫자로 변환한 p와 t를 비교하여 작거나 같은 횟수를 return.
        // 추가 설명) p길이가 18까지 가능, 만약 11자리가 되버리면 int의 최대수인 2147483647 초과 따라서 Long 사용

        for(int i=0; i<=t.length()-p.length(); i++) {
            long a = Long.parseLong(p);
            long b = Long.parseLong(t.substring(i,i+p.length()));

            if(b <= a) answer++;
        }

        return answer;
    }
}
