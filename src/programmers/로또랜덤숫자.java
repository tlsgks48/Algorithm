package programmers;

import java.util.Arrays;
import java.util.Random;

public class 로또랜덤숫자 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];

        for(int a=0; a<5; a++) {
            for(int i=0; i<6; i++) {
                lotto[i] = random.nextInt(45)+1;
                for(int j=0; j<i; j++) {
                    if(lotto[i] == lotto[j]) {
                        i--;
                        break;
                    }
                }
            }
            Arrays.sort(lotto);
            System.out.println(Arrays.toString(lotto));
        }

    }
}
