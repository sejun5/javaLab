package sec11.exam01_final;

public class personExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 person p1 = new person("123456-123123","���");
 
 System.out.println(p1.nation);
 System.out.println(p1.ssn);
 System.out.println(p1.name);
 
 
 p1.name ="��������";
 System.out.println(p1.name);
 /*final field�� �ٽ� �ʱ�ȭ�Ҽ� ����.
 p1.nation ="usa";
 System.out.println(p1.nation);
	*/

	}

}
