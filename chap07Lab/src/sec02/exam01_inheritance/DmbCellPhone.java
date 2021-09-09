package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {

	int channel;

	//DmbCellPhone(){}
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� ��� ������ �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
