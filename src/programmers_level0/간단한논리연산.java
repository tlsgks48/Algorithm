package programmers_level0;

public class 간단한논리연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
        // 문제파악 : boolean 변수 x1, x2, x3, x4 등 4개를 (x1 ∨ x2) ∧ (x3 ∨ x4) 만족하는 결과 리턴하라.
        // 1. (x1 ∨ x2) ∧ (x3 ∨ x4) 그대로 (x1 || x2) && (x3 || x4) 를 answer 대입.

        return answer;
    }
}
