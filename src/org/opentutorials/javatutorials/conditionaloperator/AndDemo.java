package org.opentutorials.javatutorials.conditionaloperator;

//&&는 좌항과 우항의 값이 모두 참(true)일 때 참이 된다. And라고 읽는다.

public class AndDemo {//1

	public static void main(String[] args) {
		if (true && true) {
            System.out.println(1);
        }
 
        if (true && false) {
            System.out.println(2);
        }
 
        if (false && true) {
            System.out.println(3);
        }
 
        if (false && false) {
            System.out.println(4);
        }

	}

}