package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1-child�� ��ȯ����");
		} else {
			System.out.println("method1-child�� ��ȯ����");
		}
	}

	public static void method2(Parent parent) {
//		Child child = (Child) parent;
		System.out.println("method2=Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();// �ڵ� ����ȯ
		method1(parentA);
		method2(parentA);
		Parent parentB = new Parent(); // �θ� Ÿ�� > �θ�Ÿ��
		method1(parentB);
		method2(parentB); //���� �߻� ->���������� ����
	}

}