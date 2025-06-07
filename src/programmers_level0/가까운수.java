package programmers_level0;

public class 가까운수 {
    public int solution(int[] array, int n) {
        int answer = 100;
        int target = 0;
        int count = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i] >= n) {
                target = array[i] - n;
            } else {
                target = n - array[i];
            }

            if(target < answer) {
                answer = target;
                count = i;
            } else if(target == answer) {
                if(array[i] < array[count]) count = i;
            }
        }

        answer = array[count];

        return answer;
    }
}
