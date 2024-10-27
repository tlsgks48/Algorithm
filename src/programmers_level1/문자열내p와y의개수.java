package programmers_level1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        // 문제 파악 : 대문자와 소문자가 섞여있는 문자열 s의 'p'와 'y' 개수를 구하여라.
        // 개수가 같으면 true를 다르면 false를 리턴. 단 대소문자 구분은 x.
        // 1. 대소문자를 구분하여야하니 toUpperCase() 이용하여 대문자로 변환
        // 2. 문자열을 for문 순회하여 p와 y의 개수를 구한다.
        // 3. 같은지 다른지 확인 후 boolean 값 return.

        String sp1 = s.toUpperCase();
        int a = 0;
        int b = 0;

        for(int i=0; i<sp1.length(); i++) {
            if(sp1.charAt(i) == 'P') a++;

            if(sp1.charAt(i) == 'Y') b++;
        }

        if( a == b) {
            answer = true;
        } else {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
