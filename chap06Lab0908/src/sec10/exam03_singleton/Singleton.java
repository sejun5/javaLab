package sec10.exam03_singleton;

public class Singleton {
private static Singleton singleton = new Singleton();

private Singleton(){}

static Singleton getInstance() { // 정적 메소드
	return singleton;
} 
}
