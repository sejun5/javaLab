package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();//������ü, �ڵ�����ȯ
		
		vehicle.run();
		//vehicle.checkFare(); ���������� ��ҷ� ��� �Ұ�
	
		
		
		Bus bus = (Bus) vehicle;//��������ȯ �ϸ�
	
	bus.run();
	bus.checkFare(); //���������� Ȯ��� ��� ����
	}

}
