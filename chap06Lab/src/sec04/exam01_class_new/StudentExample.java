package sec04.exam01_class_new;
// 실행용 클래스
public class StudentExample {
	public static void main(String args[]) {
		
		//student 객체를 만들어서 생성된 객체의 주소값을 s1 변수에 저장
		//s1 은 student 객체를 참조하니까 s1은 student 객체를 지칭
	Student s1 = new Student();
	System.out.println("s1변수가 Student 객체를 참조합니다.");
	
	Student s2 = new Student();
	System.out.println("s2변수가 또 다른 Student 객체를 참조합니다.");
	}
}
