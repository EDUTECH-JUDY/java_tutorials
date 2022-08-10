package org.opentutorials.javatutorials.Inheritance.example1;

public class ConstructorDemo {

//ConstructorDemo 객체를 생성할 때 자동으로 생성자를 만들어주기 때문
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}
	
//	매개변수가 있는 생성자가 있을 때는 자동으로 기본 생성자를 만들어주지 않는다. 
//	따라서 존재하지 않는 생성자를 호출하고 있다.
//	public ConstructorDemo(int param1) {}
//    public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
//    }
	
//	기본 생성자를 추가
//	public ConstructorDemo(){}
//    public ConstructorDemo(int param1) {}
//    public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
//    }

}
