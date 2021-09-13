package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DATABASE"); // 이미 있는 자리 2에 넣으면 원래 2부터 +1씩 밀려난다
		list.add("iBatis");
		int size = list.size();
		System.out.println("총객체수:" + size);
		System.out.println(list);

		String skill = list.get(2);
		System.out.println("2:" + skill);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);

		}
		list.remove(2);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	list.remove("iBatis");
	System.out.println(list);
	}

}
