package org.opentutorials.javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {
//		좌항과 우항을 비교해서 서로 값이 같다면 true 다르다면 false가 된다. 
//		'='이 두 개인 것을 주의하자. 
//		'='이 하나인 것은 대입 연산자로 우항의 값을 좌항의 변수에 대입할 때 사용하는 것으로 의미가 완전히 다르다.
		
		System.out.println(1==2);           //false
        System.out.println(1==1);           //true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
	}

}
