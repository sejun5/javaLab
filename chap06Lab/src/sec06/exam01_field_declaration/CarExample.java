package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		System.out.println("����ȸ�� : "+ mycar.company);
		System.out.println("�𵨸�: "+mycar.model);
		System.out.println("�÷�: "+mycar.color);
		System.out.println("�ְ�ӵ�: "+mycar.maxspeed);
		System.out.println("����ӵ�: "+mycar.speed);
		
		mycar.speed=60;
		System.out.println("����ӵ�: "+mycar.speed);
	}

}
