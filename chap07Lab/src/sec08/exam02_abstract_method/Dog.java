package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	
	public Dog() {
		this.kind = "포유류";
	}
	
	
	//추상 메소드 재정의 자동으로 생성됨(안하면에러)
	@Override
	public void sound() {
		// TODO Auto-generated method stub
System.out.println("멍");
	}

}
