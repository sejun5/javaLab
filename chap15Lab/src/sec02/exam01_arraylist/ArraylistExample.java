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
		list.add(2, "DATABASE"); // �̹� �ִ� �ڸ� 2�� ������ ���� 2���� +1�� �з�����
		list.add("iBatis");
		int size = list.size();
		System.out.println("�Ѱ�ü��:" + size);
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
