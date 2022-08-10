package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	static void a() {
		int i = 5;
	}

	public static void main(String[] args) {
//		변수 i의 값을 기준으로 동작하는 반복문
		for(int i = 0; i < 5; i++) {
//			메소드 a를 호출하고 있는데 메소드 a의 내부에는 변수 i의 값이 0으로 지정되고 있다.
			a();
			System.out.println(i);
		}

	}

}
