package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car1.company: "+car1.company);
		System.out.println("car1.maxSpeed:" + car1.maxSpeed);

		Car car4 = new Car("�ý�", "����", 200);
		System.out.println("car1.company: "+car4.company);
		System.out.println("car1.maxSpeed:" + car4.maxSpeed);
	}

}
