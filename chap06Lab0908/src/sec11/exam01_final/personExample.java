package sec11.exam01_final;

public class personExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 person p1 = new person("123456-123123","계백");
 
 System.out.println(p1.nation);
 System.out.println(p1.ssn);
 System.out.println(p1.name);
 
 
 p1.name ="을지문덕";
 System.out.println(p1.name);
 /*final field는 다시 초기화할수 없다.
 p1.nation ="usa";
 System.out.println(p1.nation);
	*/

	}

}
