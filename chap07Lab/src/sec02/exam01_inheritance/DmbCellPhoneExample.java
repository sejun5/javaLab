package sec02.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String args[]) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		//cellphone���� ��ӹ��� �ʵ�
		System.out.println("��:"+dmbCellPhone.model);
		System.out.println("����:"+dmbCellPhone.color);
		//dmbcellphone �� �ʵ�
		System.out.println("ä��:"+dmbCellPhone.channel);
		
		//cellphone���κ��� ���� �޼ҵ� ���
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�Դϴ�");
		dmbCellPhone.sendVoice("�ݰ����ϴ�");
		dmbCellPhone.hangup();
		//DmbcellPhone�� �޼ҵ� ���
		dmbCellPhone.turnOnDmb();
	}
}
