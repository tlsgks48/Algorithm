package programmers_level1;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = {};
        String[] counter = new String[s.length()];
        int count = 0;

        answer = new int[s.length()];

        for(int i=0; i<s.length(); i++) {
            count = 0;

            for(int j=0; j<s.length(); j++) {
                String aa = "" + s.charAt(i);
                if(aa.equals(counter[j])) {
                    count = 1;
                    break;
                }
            }

            if(count == 0) {
                counter[i] = "" + s.charAt(i);
                answer[i] = -1;
            } else {
                for(int j=i-1; j>=0; j--) {
                    if(s.charAt(i) == s.charAt(j)) {
                        answer[i] = i - j;
                        break;
                    }
                }
            }

        }

        return answer;
    }
}
