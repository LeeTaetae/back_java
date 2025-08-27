package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
		MyInter my = new MyInter() {
			String str1 = "";
			
			@Override
			public void getString(String content) {
//				for(int i = 0; i < content.length(); i++) {
//					char a = content.charAt(i);
////					System.out.println(a);
//					if(a ==  'C') continue;
//					String a1 = String.valueOf(a);
//					String str = a1;
//					System.out.println(str);
//				}
				char[] chars = content.toCharArray();
				for(char c : chars) {
					System.out.print((char)(c > 66 ? c + 1 : c ));
				}
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				char[] chars2 = content.toCharArray();
				for(char c : chars2) {
					if(65 <= c && c <= 90) {
//						System.out.print((char)(c + 32));
						str1 += String.valueOf((char)(c + 32));
//						return str1;
					} else if(97 <= c && c <= 122) {
//						System.out.print((char)(c-32));
						str1 += String.valueOf((char)(c-32));
//						return str1;
					}
				}
				return str1;
			}
		};
		
		my.getString("ABCD");
		System.out.println("\n");
		System.out.println(my.changeUpperOrLower("FFFF"));
	}
}
