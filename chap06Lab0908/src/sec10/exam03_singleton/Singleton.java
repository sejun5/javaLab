package sec10.exam03_singleton;

public class Singleton {
private static Singleton singleton = new Singleton();

private Singleton(){}

static Singleton getInstance() { // ���� �޼ҵ�
	return singleton;
} 
}
