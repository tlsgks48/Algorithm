package programmers_level1;

public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        // 문제 파악 : 정수 배열 nums가 주어질 때 , 3개의 숫자를 더한것이 소수라면 그 경우의 수를 return하라.
        // 1. nums의 길이를 토대로 3중 for문을 순회한다.
        // 2. 3개의 수를 더해야하니 첫 for문은 i , 두번째는 j=i+1 , 세번째는 j+1로 순회하여 각수를 더한다.
        // 3. 소수인 것을 구하기위해 나머지를 이용한다. nums[i]+nums[j]+nums[n] 길이로 for문을 순회한다.
        // 4. 나머지를 이용하여 소수인것이 확인된다면 answer++ 후 return.

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int n=j+1; n<nums.length; n++) {
                    for(int m=2; m<nums[i]+nums[j]+nums[n]; m++) {
                        if((nums[i]+nums[j]+nums[n]) % m == 0) count++;
                    }
                    if(count == 0) {
                        System.out.println("i+j+n :" + (nums[i]+nums[j]+nums[n]));
                        answer++;
                    } else {
                        count = 0;
                    }
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
