package programmers;

import java.util.Arrays;
import java.util.Hashtable;

public class Hash1 { // 프로그래머스 - 해시 - 완주하지 못한 선수 문제.

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String answer = "a";
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"}; // marina, josipa, nikola, vinko, filipa
		String[] completion = {"josipa", "filipa", "marina", "nikola"}; // josipa, filipa, marina, nikola
		
		// contain은 안에 값이 들어있는지 확인하는것.
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		
		for(String name : participant)
			hashtable.put(name,hashtable.getOrDefault(name, 0)+1);


		for(String name : completion)
				hashtable.put(name, hashtable.get(name)-1);

		
		for(String name : participant)
			if(hashtable.get(name) != 0) {
				answer = name;
				break;
			}

		
		System.out.println(hashtable);
		System.out.println(answer);
		
		Arrays.sort(participant);
		System.out.println(participant[1]);
		
//		방식1. 참가자와 완주자를 비교해서 검사하려면 이중포문 형식이 되야함.
//		int[] a = new int[participant.length];
//		int[] b = new int[participant.length-1];
//		for(int i=0; i<participant.length; i++) {
//			for(int j=0; j<participant.length-1; j++) {
//				if(participant[i] == completion[j]) {
//					a[i] = 1;
//					b[j] = b[j] + 1;
//					if(b[j] == 2) {
//						answer = completion[j];
//						break;
//					}
//				}
//			}
//			if(a[i] == 0) {
//				answer = participant[i];
//				break;
//			}
//		}
//		
//		System.out.println(answer);
//		System.out.println(participant[0].hashCode()); // 1081307714
//		System.out.println(completion[1]);
//		System.out.println(participant.length);
//		System.out.println(completion.length);
//		System.out.println(a[0]);
//		System.out.println(b[2]);
		
		// 정렬을 이용한 방식.
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		for(int i=0; i<participant.length-1; i++) {
//			if(!participant[i].equals(completion[i])) {
//				answer = participant[i];
//				break;
//			}else {
//				answer = participant[participant.length-1];
//			}
//		}
//	System.out.println(answer);
		
		// 정렬 방식 for-each문 방법.
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		int index=0;
//		for(String c: completion) {
//			if(!c.equals(participant[index]))
//				answer = participant[index];
//			index++;
//		}
//		
//		answer = participant[participant.length-1];
		
	}
}
