package org.opentutorials.javatutorials.io;

//for-each 구문을 이용해서 변수 args에 담긴 값을 한줄씩 출력하고 있다.
//즉 자바 에플리케이션에서는 메소드 main의 인자 String[] args를 통해서 사용자가 입력한 값을 전달하고 있다는 것을 알 수 있다.

class InputForeachDemo {
	public static void main(String[] args) {
		for(String e: args) {
			System.out.println(e);
		}
	}
}
