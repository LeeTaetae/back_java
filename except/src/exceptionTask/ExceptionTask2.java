package exceptionTask;

import java.util.Scanner;

public class ExceptionTask2 {
		
//		public boolean checkSymbol() {
//			boolean check = false;
//			
//			String[] symbols = {"!", "@", "#"};
//			for(String s : symbols ) {
//				if(message.contains(s)) {
//					check = true;
//				}
//			}
//		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("원하는 문자를 입력하세요.");
		message = sc.nextLine();
		
		
		try {
			if(message.contains("!")) {
				throw new ExoertException("특수문자는 좀,,,");
			}else if(message.contains("@")) {
				throw new ExoertException("특수문자는 좀,,,");
			}else if(message.contains("#")) {
				throw new ExoertException("특수문자는 좀,,,");
			}
			else {
				System.out.println(message);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("특수문자 양해 부탁드릴게요");
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
	}
}
