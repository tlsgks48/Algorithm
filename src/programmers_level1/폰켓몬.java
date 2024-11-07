package programmers_level1;

import java.util.ArrayList;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);

        for(int i=1; i<nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        return nums.length/2 < list.size() ? nums.length/2 : list.size();
    }
}
