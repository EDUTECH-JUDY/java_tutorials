package org.opentutorials.javatutorials.scope;

//메소드 a가 메소드 b를 호출하고 있는데 메소드 b에는 변수 i의 값이 존재하지 않는다. 
//이 상태에서 메소드 a를 호출하면 메소드 b에서 System.out.println(i)를 했을 때 클래스 변수가 사용될까? 
//메소드 b를 호출한 메소드 a의 지역 변수 i가 사용될까? 클래스 변수를 사용한다. 
//메소드 내(b)에서 지역변수가 존재하지 않는다면 그 메소드가 소속된 클래스의 전역변수를 사용하게 된다.

//이러한 방식을 정적 스코프(static scope) 혹은 렉시컬 스코프(lexical scope)라고도 부른다. 
//즉 사용되는 시점에서의 유효범위(메소드 a의 i)를 사용하는 것이 아니라 정의된 시점에서의 유효범위(i = 5)를 사용하는 것이다.

public class ScopeDemo6 {//5

	static int i = 5;

	static void a() {
		int i = 10;
		b();
	}

	static void b() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		a();
	}

}
