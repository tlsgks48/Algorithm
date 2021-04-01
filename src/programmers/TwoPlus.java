package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class TwoPlus {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] numbers = { 0,100,28,10}; // 5,0,2,7  ,  2,1,3,4,1   ,    0,100,50,10
		int[] answer = {}; // 2,3,4,5,6,7 , 2,5,7,9,12   ,    10, 100, 110, 1000, 1010, 1100가 나와야함.
		int[] add = new int[100];
		
		// Integer 객체를 == 로 비교하는 것은 항상 언제나 무조건 잘못된 방법이라고 생각해야 합니다. (127 이하는 ==해도 비교가 대지만, 128이상은 ==으로 비교가안댐 equlas를 해야함.) 
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// numbers배열에 있는것들을 하나씩 순차적으로 다 더해보자.
		for(int i=0; i<numbers.length; i++) {
			if(i>0) {
				for(int j=0; j<numbers.length; j++) {
					if(i!=j) {
						add[(j)+(i*(numbers.length)-1)] = numbers[i] + numbers[j];
						result.add(numbers[i] + numbers[j]);
					}
				}
			}else {
				for(int j=1; j<numbers.length; j++) {
					add[j-1] = numbers[i] + numbers[j];
					result.add(numbers[i] + numbers[j]);
				}
			}

			list.add(numbers[i]);
		}
		
		// 정렬하고 중복값 삭제.
		Collections.sort(result);
		for(int a=0; a<result.size(); a++) {
			for(int b=a+1; b<result.size(); b++) {
				System.out.println("A값 : "+result.get(a)+" B의값 : "+result.get(b));
				if(result.get(a).equals(result.get(b)) ) {
					System.out.println("빙고");
					result.remove(b);
					b--;
					
				}
				// 의미없는 비교삭제를위해 값은값 제거했으면 다음값으로..
				if(result.get(a) < result.get(b)) {
					b = result.size();
				}
			}
		}
		
		answer = new int[result.size()];
		for(int i=0; i<result.size(); i++) {
			answer[i] = result.get(i);
		}
		

		
		// 관건은 더한다음 나온 숫자를 정렬하는것과 중복제거.
		
		for(int g=0; g<list.size(); g++) {
			System.out.print(list.get(g)+" ");
		}
		System.out.println();
		
		//answer = new int[list.size()];
		for(int a=0; a<answer.length; a++) {
			System.out.print(answer[a]+" ");
		}
		System.out.println();
		
		for(int a=0; a<add.length; a++) {
			System.out.print(add[a]+" ");
		}
		System.out.println();
		
		for(int g=0; g<result.size(); g++) {
			System.out.print(result.get(g)+" ");
		}
		System.out.println();
		
		System.out.println("나온 숫자는 : "+list.get(0));

	}

}
