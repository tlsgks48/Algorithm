package programmers;
import java.util.ArrayList;
import java.util.Arrays;

public class 자주쓰는기능들 {
    public static void main(String[] args) {
        String[] ms = {"aaa" , "bbb" , "ccd"};
        String ss = "abc";

        String[] sp = ss.split("b"); // regex 구분자를 바탕으로 문자열을 잘라 String 배열로 리턴하는 함수

        System.out.println(ss.substring(0,2)); // 시작지점과 끝지점을 파라미터로 전달받아서 문자열을 자르는 함수 , 예시 : substring(시작지점, 끝지점)

        System.out.println(ss.contains("a")); // 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수 , 대/소문자를 구분

        System.out.println(ss.charAt(1)); // 인덱스 번호를 변수로 받아서 기준문자열의 index에 해당하는 문자를 반환 , 반환된 값은 String이 아닌 char타입.

        System.out.println(ss.indexOf("b")); // 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 , 만약 찾지 못했을 경우 "-1"을 반환
        System.out.println(ss.lastIndexOf("b")); // 특정 문자나 문자열이 뒤에서부터 처음 발견되는 인덱스를 반환 , 만약 찾지 못했을 경우 "-1"을 반환

        System.out.println(Integer.parseInt("456")); // 문자열 -> 인트로 변환.

        ss.replace("",""); // 문자열 내에 있는 모든 target 문자열을 replacement 문자열로 변환한 문자열을 반환
        ss.replaceAll("[aeiou]",""); // ＊정규표현식 regex와 매치되는 모든 문자열을 replacement 문자열로 변환한 문자열을 반환 , 예시 : [aeiou]는 []안에 있는 문자를 모두 변환하는 것.
        ss.replaceFirst("",""); // 문자열 내에 있는 정규식 regex와 매치되는 첫번째 문자열만 replacement 문자열로 변환한 문자열을 반환

        String.join("" , ms); // 배열을 문자열로 합치는 기능 , delimiter로 구분자(, | 등)를 추가할 수 있다.

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(Arrays.deepToString(list.toArray())); // [10, 20, 30]

        System.out.println(Arrays.toString(ms)); // Arrays.toString(배열) 기능을 사용하면 배열의 값 전체를 출력할 수 있다.

        StringBuilder sb = new StringBuilder("");
        sb.append("a"); // append는 뒤에서부터 붙이는 기능
        sb.insert(0,"b"); // insert는 앞에서부터 붙이는기능 , 0이면 맨앞

        int a = 12 % 7;
        System.out.println(a);
    }
}
