package programmers_level0;

import java.util.Arrays;

public class 삼각형의완성조건1 {

    public int solution(int[] sides) {
        int answer = 2;

        Arrays.sort(sides);

        if(sides[2] < (sides[0] + sides[1])) answer = 1;

        return answer;
    }

}
