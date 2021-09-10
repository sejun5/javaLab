package work;

public class ActionExample {
	public static void main(String[] args) {
		// 작성 위치
		//인터페이스 변수 = new 인터페이스
		
		Action action = new Action() {
			
			
			public void work(){
				System.out.println("복사를 합니다.");
			}
			
		};
		action.work();
				
	}
}
