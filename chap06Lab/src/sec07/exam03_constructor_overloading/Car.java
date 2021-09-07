package sec07.exam03_constructor_overloading;

public class Car {
	String company = "�����ڵ���";

	String model;
	String color;
	int maxSpeed;

	// ������
	Car() {
	}
	//�����ε�
	Car(String model) {
		//this.model = model;
		this(model,null,0);
	}
	//this �� �ڱ� �ڽ��� ��ü�� �ǹ��Ѵ�.
	//this() �� �ڱ� �ڽ��� ��ü�� �ٸ� �����ڸ� �ǹ��Ѵ�.
	// super �θ� ��ü
	// super() �θ� ��ü�� ������
	Car(String model,String color) {
		//this.model = model;
		//this.color = color;
		
		this(model,color,0); //�� ª�� �ڵ�
	}
	
	Car(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
