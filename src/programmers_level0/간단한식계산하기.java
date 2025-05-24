package programmers_level0;

public class 간단한식계산하기 {
    public int solution(String binomial) {
        int answer = 0;
        String[] sq = {};

        if(binomial.contains("+")) {
            sq = binomial.split("\\+");
            answer = Integer.parseInt(sq[0].trim()) + Integer.parseInt(sq[1].trim());
        } else if(binomial.contains("-")) {
            sq = binomial.split("\\-");
            answer = Integer.parseInt(sq[0].trim()) - Integer.parseInt(sq[1].trim());
        } else if(binomial.contains("*")) {
            sq = binomial.split("\\*");
            answer = Integer.parseInt(sq[0].trim()) * Integer.parseInt(sq[1].trim());
        }



        return answer;
    }
}
