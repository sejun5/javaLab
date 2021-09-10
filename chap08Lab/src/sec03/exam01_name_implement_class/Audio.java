package sec03.exam01_name_implement_class;

public class Audio implements RemoteControl {
	// 필드
	private int volume;

	// 생성자
	// 메소드

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 :" + volume);
	}

}
