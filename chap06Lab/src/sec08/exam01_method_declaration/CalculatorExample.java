package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn(); 
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1:"+result1);
		
		byte x =10;
		byte y =4;
		double result2 = myCalc.divide(x, y);//자동 형변환 int < byte
		//강제 형변환은 캐스팅 연산자 사용 해야한다
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
	}

}
