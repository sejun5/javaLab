package sec10.exam03_singleton;

public class singletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton ojb1 = new Singleton();
		// private·Î ¸·¾Æ³ö¼­ »ý¼º ºÒ°¡
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {System.out.println("°°Àº ½Ì±ÛÅæ °´Ã¼");}
		else{System.out.println("´Ù¸¥ ½Ì±ÛÅæ °´Ã¼ÀÌ´Ù");}
	}

}


