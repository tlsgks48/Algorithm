package programmers_level0;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int numberResult = 0;

        for(int i=0; i<quiz.length; i++) {
            String[] equlsSplit = quiz[i].split(" ");

            int num1 = Integer.parseInt(equlsSplit[0]);
            int num2 = Integer.parseInt(equlsSplit[2]);
            int num3 = Integer.parseInt(equlsSplit[4]);

            if(equlsSplit[1].contains("+")) {
                answer[i] = ((num1 + num2) == num3) ? "O" : "X";
            } else {
                answer[i] = ((num1 - num2) == num3) ? "O" : "X";
            }
        }

        return answer;
    }
}
