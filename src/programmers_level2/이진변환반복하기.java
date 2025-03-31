package programmers_level2;

public class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = {};
        int count = 0;
        String jin = "";

        answer = new int[2];

        while(!s.equals("1")) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '1') {
                    jin += "1";
                } else {
                    answer[1] += 1;
                }
            }

            s = Integer.toBinaryString(jin.length());
            jin = "";
            count++;
        }

        answer[0] = count;

        return answer;
    }
}
