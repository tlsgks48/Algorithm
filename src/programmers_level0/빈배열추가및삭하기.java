package programmers_level0;

import java.util.ArrayList;

public class 빈배열추가및삭하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>(); // ArrayList는 동적으로 크기가 변하는 배열
        // 문제 파악 : boolean 배열 flag 안에 flag[i] 원소들이 true면 arr[i] * 2 를 answer 배열에 추가하고 ,
        // false면 answer 배열의 뒤에서 arr[i] 개 만큼 원소를 제거한 뒤 return.
        // 1. 동적으로 크기가 변하는 배열인 ArrayList 추가.
        // 2. flag길이만큼 for문 순회
        // 3. true , false 조건에 맞게 ArrayList에 값을 추가 및 제거
        // 4. ArrayList 원소를 answer 배열에 복사.

        for(int i=0; i<flag.length; i++) {
            if(flag[i] == true) {
                for(int j=1; j<=arr[i]*2; j++) {
                    al.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    al.remove(al.size()-1);
                }
            }
        }

        answer = new int[al.size()];
        for(int i=0; i<al.size(); i++) answer[i] = al.get(i);

        return answer;
    }
}
