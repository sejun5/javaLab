package sec05.exam02_final_method;
public class SportsCar extends Car{

	//메소드 오버라이드
	@Override
	public void speedUp() {
	speed += 10;
	
	}
	
	//final 메소드 오버라이드 시도
	//cannot override the final method from Car
	/*
	public void stop() {
		System.out.println("스포츠카를 멈춥니다");
		speed=0;
	}
	
	*/
}
