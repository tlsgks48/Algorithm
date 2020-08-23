package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Knumber {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		// 문제: 배열 array의 i번째부터 j번째까지 자르고 정렬했을때 k번째 숫자를 구하는것.
		
		// 결론 : 결론은 짜르고 정렬해서 나온 k번째 위치의 값을 구하는것, 그리고 commands의 [i,j,k] 순으로 적용해서 나온 결과를 return에 담으시오.

		int[] answer = {5}, array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		answer = new int[commands.length];
		
		ArrayList<Integer> sort = new ArrayList<Integer>();
		
		for(int i=0; i<commands.length; i++) {
			for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
				System.out.println(array[j]);
				sort.add(array[j]);
			}
			Collections.sort(sort);
			System.out.println("");
		}
		
		System.out.println("구분문@@@");
		System.out.println(answer.length);
		System.out.println(commands.length);
		System.out.println(commands[0][1]);
		System.out.println(sort.get(1));
		
	}

}
