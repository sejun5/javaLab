package sec10.exam03_singleton;

public class singletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton ojb1 = new Singleton();
		// private�� ���Ƴ��� ���� �Ұ�
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {System.out.println("���� �̱��� ��ü");}
		else{System.out.println("�ٸ� �̱��� ��ü�̴�");}
	}

}


