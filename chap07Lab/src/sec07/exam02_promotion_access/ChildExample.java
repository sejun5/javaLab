package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		
		Parent parent = child; // 자동형 변환
		parent.method1();
		parent.method2();// child-method 2 가됨
		
		Child child2 = (Child)parent; //강제타입변환
		

		child2.method1();
		child2.method2();
		child2.method3();
		
		
		/* 자식> 부모는 가능하지만 원래 부모형은 자식형으로 변환불가
		Parent parent1 = new Parent();
		child2 = (Child)parent1;
		child2.method1();
		child2.method2();
		child2.method3();
	*/	
	}

}
