package ex02;

public class TwoArray {
	public static void main(String[] args) {
// 배열을 이용하여 아래와 같은 형식으로 출력
// 배열의 행 길이 : 3
// 배열의 열 길이 : 4
		
// 1234
// 5678
// 9101112
		int count = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}
		 // 배열의 행과 열 길이를 변수로 선언
//        int rowLength = 3;
//        int colLength = 4;
//        
//        // 1부터 12까지 순차적으로 증가하는 변수
//        int count = 1;
//
//        // 배열의 행 길이 출력
//        System.out.println("배열의 행 길이 : " + rowLength);
//        // 배열의 열 길이 출력
//        System.out.println("배열의 열 길이 : " + colLength);
//        
//        // --- 1234
//        // --- 5678
//        // --- 9101112
//        
//        // 바깥쪽 for문: 행(row)을 제어 (3번 반복)
//        for (int i = 0; i < rowLength; i++) {
//            // 안쪽 for문: 열(column)을 제어 (4번 반복)
//            for (int j = 0; j < colLength; j++) {
//                // 현재 숫자 출력
//                System.out.print(count);
//                // 다음 숫자로 증가
//                count++;
//            }
//            // 한 행의 출력이 끝난 후 줄바꿈
//            System.out.println();
//        }
//    }
//}