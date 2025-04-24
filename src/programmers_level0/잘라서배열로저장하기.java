package programmers_level0;

public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int length = my_str.length()/n;

        if(my_str.length() % n != 0) length++;

        answer = new String[length];

        for(int i=0; i<length; i++) {
            answer[i] = "";
            for(int j=0; j<n; j++) {
                if((i*n)+j+1 > my_str.length()) break;
                answer[i] += "" + my_str.charAt((i*n)+j);
            }
        }

        return answer;
    }
}
