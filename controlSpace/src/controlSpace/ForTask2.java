package controlSpace;

public class ForTask2 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i < 10; i++) {
			System.out.println(10 - i);
		}
		
		for(int i = 0; i < 5; i++) {
			int sub = i + 1;
			System.out.println(sub + "번 째 : 홍길동");
		}
		
		int a = "abcd".charAt(0);
		for(int i = 0; i < 4; i++) {
			System.out.println(a + i);
		}
		
		String str1 = "abcd";
		for(int i = 0; i < str1.length(); i++) {
			 
			 if(i == 2) continue;

			 
			 
			 System.out.println();
			 
		}
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				count++;
				if(count == 7) {}
				System.out.println(i);
			}
		}
		System.out.println(count);
		
		int min = 0;
		int max = 0;
		for(int i = 0; i < 30; i++) {
			int value = i + 1;
			
			if(value % 2 == 0) {
				if(value < min) {
					min = value;
				} 
				if(value > max) {
					max = value;
				}
				
			}
		}
		System.out.println(min + max);
		
		
	}
}
