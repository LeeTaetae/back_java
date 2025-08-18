package castingTest;

public class CastingTask04 {
	public static void main(String[] args) {
		 String str1 = "", str2 = "", str3= "";
		 int num1 = 0, num2 = 0, num3 = 0, result = 0;
		 String Str1 = "", Str2 = "", Str3 = "";
		 
		 
		 str1 = "12.123";
		 str2 = "345.789";
		 str3 = "6789";
		 
		 num1 = (int)Double.parseDouble(str1);
		 num2 = (int)Double.parseDouble(str2);
		 num3 = Integer.parseInt(str3);
		 
		 Str1 = String.valueOf(num1);
		 Str2 = String.valueOf(num2);
		 Str3 = String.valueOf(num3);
		 
		 result = Integer.parseInt(Str1 + Str2 + Str3);
		 
		 System.out.println(result);
		
	}
}
