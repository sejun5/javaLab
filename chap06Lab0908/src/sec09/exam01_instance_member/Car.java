package sec09.exam01_instance_member;

class Car {

	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(){} // �⺻ ������
	Car(String model){
		this.model = model;
	}
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
		
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i); //�ν��Ͻ� �޼ҵ�
			System.out.println(this.model+"�� �޸��ϴ�. ("+this.speed+"km/h)"); 
		}
	}
}