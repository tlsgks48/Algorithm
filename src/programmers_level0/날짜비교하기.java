package programmers_level0;

public class 날짜비교하기 {
    public int solution(int[] date1, int[] date2) {

        for(int i=0; i<3; i++) {
            if (date1[i] > date2[i]) { // date1[i]가 date2[i]보다 크다면 0리턴
                return 0;
            } else if (date1[i] < date2[i]) { // date1[i]가 date2[i]보다 작다면 1리턴
                return 1;
            }
        }
        // date1과 date2가 똑같다면 0 리턴
        return 0;
    }
}
