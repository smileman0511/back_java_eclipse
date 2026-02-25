package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
		// 1회성으로 사용하기 위한 클래스
		// 익명 내부 클래스
		Study study = new Study() {
			@Override
			public void setTopic(String topic) {
				System.out.println("주제: " + topic);
			}
		};

		study.setTopic("화확");
	}
}
