package sec13.exam02_constuctor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class C {

	A a1 = new A(true);
	
	//다른 패키지 private 와 default 둘다 안됨.(public만 가능)
//	A a2 = new A(1);
//	A a3 = new A("문자열");
	
}
