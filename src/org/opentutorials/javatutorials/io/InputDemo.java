package org.opentutorials.javatutorials.io;

//main 메소드의 내용을 구현하면 자바 에플리케이션을 실행할 때 main 메소드가 호출되면서 프로그램이 구동하게 되는 것이다. 
//이 때 Strings[] args는 입력 값의 파라미터로 동작한다.

//String[] args은 매개변수다. 
//매개변수는 메소드가 호출될 때 전달된 입력 값을 메소드 내부로 전달하는 역할을 하는 변수다. 
//이 변수의 데이터형은 String[]인데, String[]은 문자열을 담고 있는 배열이다. 
//args.length는 배열의 길이를 의미한다.

class InputDemo {

	public static void main(String[] args) {
		System.out.println(args.length);

	}

}
