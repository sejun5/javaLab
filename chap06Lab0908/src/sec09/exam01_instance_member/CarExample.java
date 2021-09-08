package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car myCar = new Car("Porshe"); //매개변수 넣지 않으면 생성자 사용 불가
Car yourCar = new Car("Benz");
myCar.model="제네시스"; // 인스턴스 필드 변경
myCar.run(); // 인스턴스 메소드 
yourCar.run();


	}

}
