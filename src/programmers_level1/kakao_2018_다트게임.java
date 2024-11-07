package programmers_level1;

public class kakao_2018_다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        String[] score = {"0","1","2","3","4","5","6","7","8","9","10"};
        String[] prodo = dartResult.split("[A-Z]");
        String[] bonusA = new String[3];
        int[] scoreA = new int[3];
        // 문제 파악 : "점수|보너스|[옵션]"로 이루어진 문자열 dartResult 주어질 때 각 규칙에 따라 정해진 점수를
        // 합하여 retrun하라. 점수는 총 3번 계산해야 한다.
        // 1. 점수를 계산하기 위해서 split(A-Z)을 이용하여 , 문자열을 3군데 이상으로 파싱한다.
        // 2. split으로 나눈 구역들의 길이를 이용하여 보너스(S , D , T)를 구하여 배열에 저장한다.
        // 3. split으로 나눈 String 배열의 길이를 이용하여 for문을 순회한다.
        // 4. 정해진 점수 부분인 0~10을 score 배열을 이용하여 정수 배열인 scoreA 에 3군데 각 점수를 저장한다.
        // 5. 점수와 보너스를 구했으니 , 보너스 규칙에 따라 거듭제곱을 Math.pow로 계산한다.
        // 6. 마지막으로 옵션인 "*" 와 "#" 을 곱셈 처리한다.
        // 7. 3군데 정수 값을 더한 뒤 return.

        bonusA[0] = "" + dartResult.charAt(prodo[0].length());
        bonusA[1] = "" + dartResult.charAt(prodo[0].length() + 1 + prodo[1].length());
        bonusA[2] = "" + dartResult.charAt(prodo[0].length() + 1 + prodo[1].length() + 1 + prodo[2].length());

        for(int i=0; i<prodo.length; i++) {
            for(int j=0; j<score.length; j++) {
                // 점수 문자열이 해당되는 부분을 찾으면 그 값을 저장.
                if(prodo[i].contains(score[j])) scoreA[i] = j;
            }

            if(i<3) {
                // 정해진 규칙에 따라 보너스 점수를 거듭제곱한다.
                if(bonusA[i].equals("S")) scoreA[i] = (int)Math.pow(scoreA[i],1);
                if(bonusA[i].equals("D")) scoreA[i] = (int)Math.pow(scoreA[i],2);
                if(bonusA[i].equals("T")) scoreA[i] = (int)Math.pow(scoreA[i],3);
            }

            // 정해진 규칙에 따라 "*"면 자기 위치와 -1위치를 2배 곱셈처리.
            if(prodo[i].contains("*")) {
                scoreA[i-1] *= 2;
                if(i>1) scoreA[i-2] *= 2;
            }

            if(prodo[i].contains("#")) scoreA[i-1] *= -1;
        }

        answer = scoreA[0] + scoreA[1] + scoreA[2];

        return answer;
    }
}
