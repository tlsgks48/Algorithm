package programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class 폰켓몬 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] nums = {3,3,3,2,2,2}; //  3,3,3,2,2,4  // 3,3,3,2,2,2 // 3,1,2,3
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> hash = new HashSet<>();  // HashSet의 Set의 가장 큰 장점은 중복을 자동으로 제거해주는것.
		list.add(nums[0]);
		
		for(int i=1; i<nums.length; i++) { // 하나씩 검사하면서 포함된게 없다면 추가.
				if(!list.contains(nums[i])) {
					list.add(nums[i]);
				}
		}
		
		for(int j=0; j<nums.length; j++) {
			hash.add(nums[j]);
		}
		
		if(nums.length/2 < list.size()) {
			answer = nums.length/2;
		}else {
			answer = list.size();
		}

		// nums.length/2 < list.size() ? nums.length/2 : list.size();
		System.out.println("댓어?");
		System.out.println(answer);
	}

}
