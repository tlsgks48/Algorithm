package programmers;

import java.util.ArrayList;

public class TwoPlus {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] numbers = {2,1,3,4,1}; // 5,0,2,7 , 2,1,3,4,1 , 
		int[] answer = {}; // 2,3,4,5,6,7 , 2,5,7,9,12가 나와야함.
		int[] add = new int[100];
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// numbers배열에 있는것들을 하나씩 순차적으로 다 더해보자.
		for(int i=0; i<numbers.length; i++) {
			if(i>0) {
				
			}else {
				for(int j=1; j<numbers.length; j++) {
					add[j-1] = numbers[i] + numbers[j];
				}
			}

			list.add(numbers[i]);
		}
		
		// 관건은 더한다음 나온 숫자를 정렬하는것과 중복제거.
		
		for(int g=0; g<list.size(); g++) {
			System.out.print(list.get(g)+" ");
		}
		System.out.println();
		
		answer = new int[list.size()];
		for(int a=0; a<answer.length; a++) {
			answer[a] = list.get(a);
			System.out.print(answer[a]+" ");
		}
		System.out.println();
		
		for(int a=0; a<add.length; a++) {
			System.out.print(add[a]+" ");
		}
		System.out.println();
		
		System.out.println("나온 숫자는 : "+list.get(0));

	}

}
