package programmers_level1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        // 문제 파악 : 알파벳 대소문자와 공백으로 이루어진 문자열 s와 정수 n이 주어진다.
        // 정수 n만큼 문자열의 알파벳들을 밀고 그 값을 return하라. 예) "AB" , 1 일 시 "BC" 를 return.
        // 1. s의 길이만큼 for문을 순회한다.
        // 2. 아스키코드를 이용하여 알파벳 대문자인 65 ~ 90 , 알파벳 소문자인 97 ~ 122 범위를 체크한다.
        // 3. 문자열의 각 위치를 순회하는 동안 charAt과 isUpperCase를 이용하여 공백 및 대소문자를 구분한다.
        // 4. 대문자일 경우 charAt(i) + n - 65 를 계산한 값과 % 26을 이용하여 알파벳 대문자의 위치를 이동한다.
        // 5. 소문자일 경우 charAt(i) + n - 97 를 계산한 값과 %26을 이용하여 알파벳 대문자의 위치를 이동한다.
        // 6. 계산하여 구한 값을 answer에 더한 뒤 return한다.

        for(int i=0; i<s.length(); i++) {
            String emp = " ";
            int c = 0;
            if(s.charAt(i) != ' ') { // 공백 체크
                if(Character.isUpperCase(s.charAt(i))) {
                    c = ((int)s.charAt(i) + n - 65) % 26; // -65와 %26 을 이용하여 알파벳의 위치를 이동한다.
                    emp = "" + (char)(c+65); // 이동시킨 후 다시 대문자의 아스키 코드 값을 더한다.
                } else {
                    c = ((int)s.charAt(i) + n - 97) % 26; // -97와 %26 을 이용하여 알파벳의 위치를 이동한다.
                    emp = "" + (char)(c+97); // 이동시킨 후 다시 소문자의 아스키 코드 값을 더한다.
                }
            }
            answer += emp;
        }

        return answer;
    }
}
