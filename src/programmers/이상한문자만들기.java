package programmers;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String s = "try hello world";
		String answer = "";
		String[] sq =  s.split("\\s",-1);
		int a = 0;
		
		for( String space : sq) {
			for(int i=0; i<space.length(); i++) {
				if(i%2 == 0) {
					answer += Character.toUpperCase(space.charAt(i));
				}else {
					answer += Character.toLowerCase(space.charAt(i));
				}
			}
			a++;
			if(a<sq.length)
			answer += " ";
		}
		System.out.println(answer);
	}

}
