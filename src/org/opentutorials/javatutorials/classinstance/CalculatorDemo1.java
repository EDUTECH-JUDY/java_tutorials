package org.opentutorials.javatutorials.classinstance;

class Calculator {
//	static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다.
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
//		인스턴스를 통해서 PI에 접근
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
//		클래스를 통해서 PI에 접근
//		객체 Calculator.java의 다른 기능(sum, avg)은 필요없고, 원주율만 필요할 때 클래스에 직접 접근하기 때문에 인스턴스를 생성할 필요가 없어진다.
		System.out.println(Calculator.PI);

	}

}
