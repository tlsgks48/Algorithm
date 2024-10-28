package programmers_level1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = {};
        String str = "" + n;
        // 문제 파악 : 자연수 n이 주어질 때 각 자리의 숫자를 배열 형태로 대입한 뒤 뒤집어서 리턴.
        // 1. n을 배열형태로 대입하기 위해 String을 활용하여 크기 확보.
        // 2. String 크기만큼 for문 순회.
        // 3. 나머지를 이용하여 맨끝자리부터 배열 첫위치에 삽입.
        // 4. 모두 대입 후 retrun.

        answer = new int[str.length()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}
