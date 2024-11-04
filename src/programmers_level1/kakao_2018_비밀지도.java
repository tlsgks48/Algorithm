package programmers_level1;

public class kakao_2018_비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        // toBinaryString와 format을 이용하여 푼 방식

        for(int i=0; i<n; i++) {
            answer[i] = String.format("%" + n + "s",Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = answer[i].replace("0"," ").replace("1","#");
        }

        return answer;
    }
    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] prodo = new int[n][n];
        int[] neo = new int[n];
        int sum = 0;
        // 문제 파악 : 2진수로 풀어야할 암호가 저장된 정수 배열 arr1 , arr2가 주어질 때 길이가 n인 정사각형 배열에
        // 두 정수 배열의 2진수를 합쳐서 나열하고 , 1인 부분을 "#" , 0인 부분을 " "으로 변환해서 return하라.
        // 1. 2진수의 각 위치 값들을 저장할 neo 배열을 생성하고 값을 대입한다. (1 , 2 , 4 , 8 등)
        // 2. arr1 배열과 arr2 배열의 값들을 neo 배열의 값들을 이용하여 2진수 위치들을 구한다.
        // 3. 2진수 위치를 구햇으면 2차원 배열 prodo의 각 위치에 1을 저장한다.
        // 4. 2진수 값을 모두 구했으면 StringBuilder의 insert를 이용하여 "#"과 " "을 구하고 return.

        StringBuilder sb = new StringBuilder();

        for(int a=0; a<n; a++) {
            sum *= 2;
            if(a == 0) {
                sum = 1;
                neo[a] = sum;
            } else {
                neo[a] = sum;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=n-1; j>=0; j--) {
                if(neo[j] <= arr1[i]) {
                    arr1[i] -= neo[j];
                    prodo[i][j] = 1;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=n-1; j>=0; j--) {
                if(neo[j] <= arr2[i]) {
                    arr2[i] -= neo[j];
                    prodo[i][j] = 1;
                }
            }
        }

        for(int s=0; s<n; s++) {
            for(int t=0; t<n; t++) {
                if(prodo[s][t] == 1) {
                    sb.insert(0 , "#");
                } else {
                    sb.insert(0 , " ");
                }
            }
            answer[s] = sb.toString();
            sb.setLength(0);
        }

        return answer;
    }
}
