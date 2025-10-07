package array;

public class Array04 {
	public static void main(String[] args) {
		
//		단일 문자 배열에 단어와 숫자를 섞음
		char[] papers = {'1', 'L', '2', 'O', '3', 'V', '4', 'E'};
		String word = "";
		
		for(int i = 0; i < papers.length; i++) {
//			문자는 아스키코드에 의해 10진수로 대응
			int words = papers[i];
			
//			65 ~ 90  사이는 대문자 A~Z
//			97 ~ 122 사이는 소문자 a~z
			if((words >= 65 && words <= 90) || (words >= 97 && words <= 122)) {
				word += (char)words;
			}
		}
		
		System.out.println("단어 : " + word);
	}
}
