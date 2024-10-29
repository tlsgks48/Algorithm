package programmers_level1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        // 문제 파악 : 문자열 phone_number의 마지막 4자리를 제외하고 모두 *로 변환후 return하라.
        // 1. phone_number의 길이 - 4로 for문 순회하여 * 생성.
        // 2. substring을 이용하여 phone_number의 마지막 4자리를 붙인 후 retrun.

        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }

        answer += phone_number.substring(phone_number.length()-4,phone_number.length());

        return answer;
    }
}
