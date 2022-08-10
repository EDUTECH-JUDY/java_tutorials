package org.opentutorials.javatutorials.overloading.example;

//메소드 오버로딩은 매개변수를 사용한다. 
//즉 매개변수가 다르면 이름이 같아도 서로 다른 메소드가 되는 것이다. 
//반면에 매개변수는 같지만 리턴타입이 다르면 오류가 발생한다.

//메소드를 호출 할 때 전달되는 인자의 데이터 타입에 따라서 어떤 메소드를 호출할지를 자바가 판단 할 수 있기 때문이다. 
//하지만 메소드의 반환값은 메소드를 호출하는 시점에서 전달되지 않는 정보이기 때문에 오버로딩의 대상이 될 수 없다.

public class OverloadingDemo {
	void A() {
		System.out.println("void A()");
	}

	void A(int arg1) {
		System.out.println("void A (int arg1)");
	}

	void A(String arg1) {
		System.out.println("void A (String arg1)");
	}

	// int A (){System.out.println("void A()");}
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("coding everybody");
	}
}
