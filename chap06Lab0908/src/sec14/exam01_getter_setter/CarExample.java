package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String args[]) {
		Car mycar = new Car();

		mycar.speed2 = -5;
		//private �� �ƴϸ� �̷��� �ٷ� ȣ�Ⱑ��������
		
		mycar.setSpeed(-5);
		//private�� ����Ǹ� �̷��� �޼��� �ȿ� set�� �������� �����
		System.out.println("���� �ӵ�: "+mycar.getSpeed());
		//private�� ����Ǹ� �� �����ö� Ŭ���� �޼���ȿ� get�� �����
	}

}