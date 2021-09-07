package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		System.out.println("제작회사 : "+ mycar.company);
		System.out.println("모델명: "+mycar.model);
		System.out.println("컬러: "+mycar.color);
		System.out.println("최고속도: "+mycar.maxspeed);
		System.out.println("현재속도: "+mycar.speed);
		
		mycar.speed=60;
		System.out.println("현재속도: "+mycar.speed);
	}

}
