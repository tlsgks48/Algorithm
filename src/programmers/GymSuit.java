package programmers;

import java.util.ArrayList;

public class GymSuit {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// 문제 : 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 듣게해야함.
		// 1. 도난당한 학생의수는 1명이상 n명이하 중복번호는 없음. 2. 여벌체육복을 있는 학생수는 1명이상 n명이하
		// 3. 여벌체육복은 자기번호 앞과뒤만 빌려줄수 있고, 여벌체육복 가져온 학생이 도난당하면 다른학생 못빌려줌.
		// 4. 결론적으로 체육수업을 들을 수 있는 학생의 최댓값 리턴하는것이 문제의 핵심.

		
		// 푸는중
		int[] lost = {1,2}, reserve = {2,3};
		int n = 3, answer = 0;
		answer = n-lost.length;
		
		ArrayList<Integer> student = new ArrayList<Integer>();
		
		ArrayList<Integer> lost2 = new ArrayList<Integer>();
		for(int i=0; i<lost.length; i++) {
			lost2.add(lost[i]);
		}
		ArrayList<Integer> reserve2 = new ArrayList<Integer>();
		for(int i=0; i<reserve.length; i++) {
			reserve2.add(reserve[i]);
		}
		
		for(int i=0; i<lost2.size(); i++) {
			if(reserve2.contains(lost2.get(i))) {
				reserve2.remove(lost2.get(i));
				lost2.remove(lost2.get(i));
				answer += 1;
			}
		}
		
		for(int i=0; i<lost2.size(); i++) {
			for(int j=0; j<reserve2.size(); j++) {
				if(lost2.get(i) == reserve2.get(j)+1 || lost2.get(i) == reserve2.get(j)-1 || lost2.get(i) == reserve2.get(j)) {
					answer += 1;
					lost2.remove(i);
					reserve2.remove(j);
					j = reserve2.size();
					i = -1;
				}
			}
		}
		
//		for(int i=0; i<lost.length; i++) {
//			for(int j=0; j<reserve.length; j++) {
//				if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1 || lost[i] == reserve[j]) {
//					if(student.size() > 0 && student.contains(reserve[j])) {
//						j = reserve.length;
//					}else {
//						answer += 1;
//						student.add(reserve[j]);
//						j = reserve.length;
//					}
//				}
//			}
//		}
		System.out.println("return값은 "+answer);
		
		}

}
