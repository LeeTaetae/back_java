package test1;

public class Test2 {
	public static void main(String[] args) {
		char a = ' ', b = ' ', A =' ', B =' ';
		String str1 = null, str2 = null;
		int num1 = 0, num2 = 0, result = 0;
		
		a= 'a';
		b = 'b';
		
		
		
		num1 = (int)(a-32);
		num2 = (int)(b-32);
		
		A = (char)num1;
		System.out.println(A);
		
		B = (char)num2;
		System.out.println(B);
		
		result = num1 + num2;
		System.out.println(result);
		
	}
}
