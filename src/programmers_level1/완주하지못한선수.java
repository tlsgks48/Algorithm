package programmers_level1;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        int[] a = new int[participant.length];
        int[] b = new int[participant.length-1];
        for(int i=0; i<participant.length; i++) {
            for(int j=0; j<participant.length-1; j++) {
                if(participant[i].equals(completion[j]) ) {
                    a[i] = 1;
                    b[j] = b[j] + 1;
                    if(b[j] >= 2) {
                        answer = completion[j];
                        break;
                    }
                }
            }
            if(a[i] == 0) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}
