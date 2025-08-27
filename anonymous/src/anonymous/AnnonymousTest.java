package anonymous;

public class AnnonymousTest {
	public static void main(String[] args) {
		Study study = new Study() {
			// 메서드 밖 영역이므로 클래스
			
			@Override
			public String setTopic(String topic) {
				// TODO Auto-generated method stub
				//메서드 => 메서드 선언은 클래스 안에서
				return topic;
			}
		};
		
		study.setTopic("테스트");
	}
}
