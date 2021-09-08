package Work;

public class work2 {

	private static final work2 singleton = new work2();

	private work2() {
	}

	static work2 getInstance() {
		
		return singleton;
	}
}
