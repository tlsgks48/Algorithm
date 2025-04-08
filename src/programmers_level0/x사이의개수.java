package programmers_level0;

public class x사이의개수 {
    public int[] solution(String myString) {
        int[] answer = {};
        int sum = 0;
        int count = 0;

        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                sum = 1;
            }
            if(sum == 1) {
                sum = 0;
                count++;
            }
        }

        answer = new int[count+1];

        sum = 0;
        count = 0;

        for(int j=0; j<myString.length(); j++) {
            if(myString.charAt(j) == 'x') {
                answer[count] = sum;
                sum = 0;
                count++;
            } else {
                sum++;
                if(j == myString.length()-1) answer[count] = sum;
            }

        }

        return answer;
    }
}
