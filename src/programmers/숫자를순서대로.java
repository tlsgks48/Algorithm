package programmers;

import java.util.ArrayList;

public class 숫자를순서대로 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] arr = {4,1,3,2};
		 boolean answer = true;
	        int count=0;

	        ArrayList<Integer> list = new ArrayList<Integer>();

	        for(int i=0; i<arr.length; i++){
	            list.add(arr[i]);
	        }

	        for(int j=1; j<=arr.length; j++){
	            if(list.contains(j)){
	                count++;
	            }
	        }

	        if( count == arr.length){
	            answer = true;
	        }else{
	            answer = false;
	        }
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println(list.size()+", "+count);
	}

}
