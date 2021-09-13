package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class arrayAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		// asList 는 객체 생성안하고 불러오는 정적 메소드
		for (String name : list1) {
			System.out.println(name);

		}
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}
}
