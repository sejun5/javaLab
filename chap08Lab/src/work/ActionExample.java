package work;

public class ActionExample {
	public static void main(String[] args) {
		// �ۼ� ��ġ
		//�������̽� ���� = new �������̽�
		
		Action action = new Action() {
			
			
			public void work(){
				System.out.println("���縦 �մϴ�.");
			}
			
		};
		action.work();
				
	}
}
