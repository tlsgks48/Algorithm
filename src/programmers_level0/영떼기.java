package programmers_level0;

public class 영떼기 {
    public String solution(String n_str) {
        String answer = "";
        boolean signal = true;

        if(n_str.charAt(0) == '0') {
            for(int i=1; i<n_str.length(); i++) {
                if(signal) {
                    if(n_str.charAt(i) != '0') {
                        answer += "" + n_str.charAt(i);
                        signal = false;
                    }
                } else {
                    answer += "" + n_str.charAt(i);
                }
            }
        } else {
            answer = n_str;
        }

        return answer;
    }
}
