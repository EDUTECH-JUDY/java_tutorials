package org.opentutorials.javatutorials.loop;

//종료조건에 따르면 10행이 출력돼야 하는데 5행만 출력되었다. 
//2행의 if(i == 5) 에 의해서 i의 값이 5일 때 break 문이 실행되면서 반복문이 완전히 종료된 것이다. 
//반복문 안에서 break가 실행되면 반복문을 즉시 종료시킨다. 
//참고로 조건문에 의해서 실행되는 코드가 한 줄일 경우 예제와 같이 중괄호를 생략 할 수 있다. 
//반복문도 반복적으로 실행할 코드가 한 줄일 경우 중괄호를 생략할 수 있다.

public class BreakDemo {

	public static void main(String[] args) {
		 for (int i = 0; i < 10; i++) {
	            if (i == 5)
	                break;
	            System.out.println("Coding Everybody " + i);
	        }

	}

}
