package sec03.exam01_name_implement_class;

public class Audio implements RemoteControl {
	// �ʵ�
	private int volume;

	// ������
	// �޼ҵ�

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("����� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����� ���ϴ�.");
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
		System.out.println("���� ����� ���� :" + volume);
	}

}
