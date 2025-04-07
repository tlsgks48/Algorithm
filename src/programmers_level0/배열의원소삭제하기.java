package programmers_level0;

public class 배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int count = 0;
        int check = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) count++;
            }
        }

        answer = new int[arr.length - count];
        count = 0;

        for(int i=0; i<arr.length; i++) {
            check = 0;
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) check = 1;
            }
            if(check == 0) {
                answer[count] = arr[i];
                count++;
            }
        }

        return answer;
    }
}
