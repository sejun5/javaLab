package sec05.exam02_final_method;
public class SportsCar extends Car{

	//�޼ҵ� �������̵�
	@Override
	public void speedUp() {
	speed += 10;
	
	}
	
	//final �޼ҵ� �������̵� �õ�
	//cannot override the final method from Car
	/*
	public void stop() {
		System.out.println("������ī�� ����ϴ�");
		speed=0;
	}
	
	*/
}
