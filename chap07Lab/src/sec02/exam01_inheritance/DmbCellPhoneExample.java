package sec02.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String args[]) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		//cellphone에서 상속받은 필드
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		//dmbcellphone 의 필드
		System.out.println("채널:"+dmbCellPhone.channel);
		
		//cellphone으로부터 받은 메소드 출력
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동입니다");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangup();
		//DmbcellPhone의 메소드 출력
		dmbCellPhone.turnOnDmb();
	}
}
