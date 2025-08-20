package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arData1  = {1,2,3,4}; // 값을 알고 있을때
		int[] arData2 = new int[5]; //칸수까지만 알고 있을때 (힙 메모리에 int 5칸짜리 배열을 할당하고 초기화를 시킬 수 있도록 도와주는 연산자 => new 연산자)
		int[] arData3 = null; //주소의 초기값 (크기와 값을 모를때)
//		null = 주소의 초기값
		
		
	
		for(int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
	      
	}
}
