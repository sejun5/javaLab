package sec02.exam01_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * box box = new box(); box.set("ȫ�浿"); // object o = "ȫ�浿", �ڵ�����ȯ(�θ���<-�ڽ���)
		 * String name = (String)box.get(); // ��������ȯ(�ڽ��� <-�θ���)
		 * 
		 * box.set(new Apple()); //Object o = new Apple(); Apple apple =
		 * (Apple)box.get();
		 */

		box<String> box1 = new box<String>();
		box1.set("Hello"); // ����ȯ�� ����.
		String str = box1.get(); // ����ȯ�� ����.

		box<Integer> box2 = new box<Integer>();
		box2.set(6);

		int value = box2.get();
	}

}
