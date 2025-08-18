package castingTest;

public class CatingTask03 {
	public static void main(String[] args) {
		char a = ' ', k = ' ', j = ' ';
		String A = "", K = "", J = "";

		a = 'a';
		j = 'j';
		k = 'k';
		
		char charNum1 = (char)(a - 32);
		A = String.valueOf(charNum1);
		System.out.println(A);
		
		char charNum2 = (char)(j -32);
		J = String.valueOf(charNum2);
		System.out.println(J);
		
		char charNum3 = (char)(k -32);
		K = String.valueOf(charNum3);
		System.out.println(K);
		
		System.out.printf("%S와 %S와 %S 입니다", A, J, K);
	}
}
