package programmers_level0;

import java.util.ArrayList;

public class 넘버투의영역 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        // 문제 파악 : arr 배열 원소 중에 2가 연속으로 있는 영역들을 return
        // 1. arr 배열의 길이만큼 for문 순회를 하여 2의 갯수를 파악
        // 2. ArrayList로 2가 있는 배열의 위치를 저장
        // 3. 2가 있는지 없는지 if문으로 확인 , 0이면 -1 리턴
        // 4. 2의 첫 위치와 마지막 위치를 계산하여 answer 배열 크기 선언
        // 5. 2의 첫 위치와 마지막 위치로 for문 순회하여 arr값 추가

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) al.add(i);
        }

        if(al.size() > 0) {
            int m = 0;
            answer = new int[al.get(al.size()-1) - al.get(0) + 1];
            for(int j=al.get(0); j<=al.get(al.size()-1); j++) {
                answer[m] = arr[j];
                m++;
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
