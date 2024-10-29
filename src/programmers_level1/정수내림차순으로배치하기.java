package programmers_level1;

import java.util.ArrayList;
import java.util.Comparator;

public class 정수내림차순으로배치하기 {

    public long solution(long n) {
        long answer = 0;
        // 문제 파악 : 정수 n이 주어질 때 n의 각 자릿수를 큰 수 -> 작은 수로 정렬 후 return하라.
        // 1. 크기가 동적으로 변하는 ArrayList에 나머지를 이용하여 n의 각 자릿수를 저장.
        // 2. Comparator.reverseOrder()를 이용하여 내림차순 정렬.
        // 3. StringBuilder의 append로 숫자를 이어붙인다.
        // 4. Long.parseLong으로 변환 후 return.

        StringBuilder sb = new StringBuilder();
        ArrayList<Long> al = new ArrayList<>();

        while(n > 0) {
            al.add((n%10));
            n /= 10;
        }

        al.sort(Comparator.reverseOrder());

        for(int i=0; i<al.size(); i++) {
            sb.append(al.get(i));
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }

    public long noSort(long n) {
        long answer = 0;
        long a = 10;
        // 문제 파악 : 정수 n이 주어질 때 n의 각 자릿수를 큰 수 -> 작은 수로 정렬 후 return하라.
        // 1. 크기가 동적으로 변하는 ArrayList에 나머지를 이용하여 n의 각 자릿수를 저장.
        // 2. 이중 for문을 이용하여 가장 작은 숫자를 StringBuilder에 대입한다.
        // 3. 대입이 완료되면 해당 숫자는 ArrayList에서 삭제
        // 4. ArrayList의 크기가 0이 될동안 반복
        // 4. StringBuilder에 모든 숫자를 대입했으면 Long.parseLong으로 변환 후 return.

        StringBuilder sb = new StringBuilder();
        ArrayList<Long> al = new ArrayList<>();

        while(n > 0) {
            al.add((n%10));
            n /= 10;
        }

        for(int i=0; i<al.size(); i++) {
            for(int j=0; j<al.size(); j++) {
                if(al.get(j) <= a) a = al.get(j);
            }

            if(al.size() > 1) {
                sb.insert(0 , Long.toString(a));
                al.remove(Long.valueOf(a));
                a = 10;
            } else {
                sb.insert(0 , al.get(0));
                al.remove(0);
            }
            i = -1;
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
