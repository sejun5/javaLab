package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String args[]) {
		Car mycar = new Car();

		mycar.speed2 = -5;
		//private 가 아니면 이렇게 바로 호출가능하지만
		
		mycar.setSpeed(-5);
		//private로 선언되면 이렇게 메서드 안에 set을 만들어놓고 써야함
		System.out.println("현재 속도: "+mycar.getSpeed());
		//private로 선언되면 값 가져올때 클래스 메서드안에 get을 써야함
	}

}