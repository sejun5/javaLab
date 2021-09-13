package sec02.exam01_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * box box = new box(); box.set("홍길동"); // object o = "홍길동", 자동형변환(부모형<-자식형)
		 * String name = (String)box.get(); // 강제형변환(자식형 <-부모형)
		 * 
		 * box.set(new Apple()); //Object o = new Apple(); Apple apple =
		 * (Apple)box.get();
		 */

		box<String> box1 = new box<String>();
		box1.set("Hello"); // 형변환이 없다.
		String str = box1.get(); // 형변환이 없다.

		box<Integer> box2 = new box<Integer>();
		box2.set(6);

		int value = box2.get();
	}

}
