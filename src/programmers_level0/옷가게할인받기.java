package programmers_level0;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;

        if(price >= 500000) {
            answer = (int)((float)price - ((float)price * 4/20));
        } else if(price >= 300000) {
            answer = (int)((float)price - ((float)price * 2/20));
        } else if(price >= 100000) {
            answer = (int)((float)price - ((float)price * 1/20));
        } else {
            answer = price;
        }

        return answer;
    }
}
