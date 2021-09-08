package sec14.exam01_getter_setter;

public class Car {
	// 필드
	int speed2;
	private int speed;
	private boolean stop;
	// 생성자

	// 메소드 (다른곳에서 호출하면 private로 막혀있던 변수 리턴)
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed< 0) {this.speed =0; return;}
		else {this.speed=speed;}
		
	}
	//getter
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed=0;
	}
}