package programmers_level0;

public class 컨트롤제트 {
    public int solution(String s) {
        int answer = 0;

        String[] sq = s.split(" ");

        for(int i=0; i<sq.length; i++) {
            if(sq[i].equals("Z")) {
                answer -= Integer.parseInt(sq[i-1]);
            } else {
                answer += Integer.parseInt(sq[i]);
            }
        }

        return answer;
    }
}
