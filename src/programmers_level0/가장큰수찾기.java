package programmers_level0;

public class 가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = {};
        int count = 0;

        answer = new int[2];

        for(int i=0; i<array.length; i++) {
            if(array[i] > count) {
                count = array[i];
                answer[1] = i;
            }
        }

        answer[0] = count;

        return answer;
    }
}
