package programmers_level2;

public class 다음큰숫자 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        int count2 = 0;
        String binary = Integer.toBinaryString(n);

        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') count++;
        }

        while(true) {
            n++;
            binary = Integer.toBinaryString(n);
            for(int i=0; i<binary.length(); i++) {
                if(binary.charAt(i) == '1') count2++;
            }

            if(count == count2) break;

            count2 = 0;
        }

        answer = n;

        return answer;
    }
}
