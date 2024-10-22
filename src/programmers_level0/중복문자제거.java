package programmers_level0;

import java.util.Arrays;

public class 중복문자제거 {
    public static void main(String[] args) {
        String my_string = "people";
        String[] aas = my_string.split("");

        System.out.println(Arrays.toString(aas));
        // String s = "" + my_string.charAt(i);
    }

    public String solution(String my_string) {
        String answer = "";
        String[] ms = my_string.split("");
        // 문제 파악 : 문자열 my_string 중에서 중복된 문자를 처음 하나만 남기고 전부 제거하라.
        // 1. my_string 문자열을 split을 이용하여 배열로 변환
        // 2. ms 길이만큼 for문 순회(i)
        // 3. ms 길이만큼 이중for문(j) , 시작은 i+1
        // 4. for문(j)으로 ms배열의 각 원소들을 중복되는지 체크 후 중복되면 "/"로 변환.
        // 5. String.join으로 배열을 문자열로 변환 후 , replaceAll로 "/" 제거

        for(int i=0; i<ms.length; i++) {
            for(int j=i+1; j<ms.length; j++) {
                if(ms[i].equals(ms[j])) ms[j] = "/";
            }
        }

        answer = String.join("" , ms);
        answer = answer.replaceAll("/" , "");

        return answer;
    }
}
