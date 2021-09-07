package sec07.exam03_constructor_overloading;

public class Car {
	String company = "현대자동차";

	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() {
	}
	//오버로딩
	Car(String model) {
		//this.model = model;
		this(model,null,0);
	}
	//this 는 자기 자신의 객체를 의미한다.
	//this() 는 자기 자신의 객체의 다른 생성자를 의미한다.
	// super 부모 객체
	// super() 부모 객체의 생성자
	Car(String model,String color) {
		//this.model = model;
		//this.color = color;
		
		this(model,color,0); //더 짧은 코딩
	}
	
	Car(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
