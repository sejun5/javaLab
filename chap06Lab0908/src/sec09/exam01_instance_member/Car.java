package sec09.exam01_instance_member;

class Car {

	//필드
	String model;
	int speed;
	
	//생성자
	Car(){} // 기본 생성자
	Car(String model){
		this.model = model;
	}
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
		
	}
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i); //인스턴스 메소드
			System.out.println(this.model+"가 달립니다. ("+this.speed+"km/h)"); 
		}
	}
}
