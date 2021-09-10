package sec03.exam02_noname_implement_class;

public interface RemoteControl {
	// 인터페이스의 구성멤버
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	// 추상 메소드     (재정의 해야함 (구현한다))
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}
		else {
			System.out.println("무음 해제합니다");
		}
	}
	// 정적 메소드
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
