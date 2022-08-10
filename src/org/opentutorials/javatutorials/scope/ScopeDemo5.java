package org.opentutorials.javatutorials.scope;

//반복문에서 정의한 변수도 반복문 밖에서는 유효하지 않다. 
//반복문에서 선언된 변수 i는 반복문 밖에서는 유효하지 않기 때문이다.

public class ScopeDemo5 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
    }
}
