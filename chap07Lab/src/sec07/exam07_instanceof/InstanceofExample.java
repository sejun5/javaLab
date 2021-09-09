package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-child로 변환성공");
		} else {
			System.out.println("method1-child로 변환실패");
		}
	}

	public static void method2(Parent parent) {
//		Child child = (Child) parent;
		System.out.println("method2=Child로 변환 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();// 자동 형변환
		method1(parentA);
		method2(parentA);
		Parent parentB = new Parent(); // 부모 타입 > 부모타입
		method1(parentB);
		method2(parentB); //예외 발생 ->비정상으로 종료
	}

}
