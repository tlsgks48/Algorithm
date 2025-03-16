package programmers_level0;

public class 다섯명씩 {
    public String[] solution(String[] names) {
        String[] answer = {};
        int count = 0;

        if(names.length % 5 == 0) {
            answer = new String[names.length/5];
        } else {
            answer = new String[(names.length/5) + 1];
        }

        for(int i=0; i<names.length; i++) {
            if(i % 5 == 0) {
                answer[count] = names[i];
                count++;
            }
        }

        return answer;
    }
}
