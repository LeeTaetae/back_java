package ifelse;

public class IfElse {
	public static void main(String[] args) {
////		String road = "오른쪽";
//		
//		if(road.equals("오른쪽")) {
//			System.out.println("여우누이는 과일가게에 도착했어요🍎");
//		} else {
//			System.out.println("여우누이는 생선가게에 도착했어요🐟");
//		}
//		
//		String road1 = "빵집";
//		String road2 = "카페";
//		
//		if(road1.equals("빵집")) {
//			System.out.println("여우누이는 빵집에 갔어요🥖");
//		} else if(road2.equals("카페")) {
//			System.out.println("여우누이는 카페에 갔어요☕");
//		} else {
//			System.out.println("여우누이는 도서관에 갔어요📚");
//		}
		
		String road = "카페";
		switch(road) {
		case "빵집" :
			System.out.println("여우누이는 빵집에 갔어요🥖");
			break;
		case "카페" :
			System.out.println("여우누이는 카페에 갔어요☕");
			break;
		case "도서관" :
			System.out.println("여우누이는 도서관에 갔어요📚");
			break;
		default : 
			System.out.println("여우누이는 집으로 갔어요🏠");
		}
	}
}
