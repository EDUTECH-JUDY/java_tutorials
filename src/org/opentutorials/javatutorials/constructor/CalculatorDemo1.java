package org.opentutorials.javatutorials.constructor;

class Calculator {
	int left, right;
	
//	생성자는 그 이름처럼 객체를 생성할 때 호출
	public Calculator(int left, int right) {
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
		
//		생성자를 이용해서 객체를 생성하는 방법
		Calculator c1 = new Calculator(10,20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
	}

}
