package org.opentutorials.javatutorials.overloading.example;

//클래스 OverloadingDemo2는 OverloadingDemo을 상속 받고 있다. 
//OverloadingDemo2에서 정의된 메소드 A는 문자열을 데이터타입으로 하는 두개의 매개변수를 가지고 있다. 
//이러한 형태의 변수는 부모 클래스에서는 정의되어 있지 않기 때문에 메소드 오버로딩이 되는 것이다. 
//반면에 4행에서 정의된 메소드 A는 매개변수가 없다. 
//그리고 부모 클래스에는 이미 매개변수가 없는 메소드 A가 존재한다. 
//이 둘은 매개변수의 형태가 같기 때문에 오버로딩이 아니라 오버라이딩에 해당한다.

public class OverloadingDemo2 extends OverloadingDemo {
	void A(String arg1, String arg2) {
		System.out.println("sub class : void A (String arg1, String arg2)");
	}

	void A() {
		System.out.println("sub class : void A ()");
	}

	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("coding everybody");
		od.A("coding everybody", "coding everybody");

	}
}
