package programmers_level1;

import java.util.Scanner;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 문제 파악 : 두 개의 정수 n과 m이 주어질 시
        // 가로 길이 n , 세로 길이 m 인 직사각형 *을 만들어라.
        // 1. 이중 for문을 이용한다.
        // 2. 가로 길이인 a 길이만큼 print로 *를 찍는다
        // 3. 세로 길이인 b의 각 위치마다 println 이용하여 줄바꿈을 한다.

        for(int i=0; i<b; i++) {
            for(int j=0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
