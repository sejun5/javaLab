package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		
		Parent parent = child; // �ڵ��� ��ȯ
		parent.method1();
		parent.method2();// child-method 2 ����
		
		Child child2 = (Child)parent; //����Ÿ�Ժ�ȯ
		

		child2.method1();
		child2.method2();
		child2.method3();
		
		
		/* �ڽ�> �θ�� ���������� ���� �θ����� �ڽ������� ��ȯ�Ұ�
		Parent parent1 = new Parent();
		child2 = (Child)parent1;
		child2.method1();
		child2.method2();
		child2.method3();
	*/	
	}

}
