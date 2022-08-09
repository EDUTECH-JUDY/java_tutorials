package org.opentutorials.javatutorials.conditionaloperator;

//중첩된 if 문을 하나로 줄였다. 
//덕분에 코드의 복잡성도 낮아졌다. 위의 코드에서 &&는 아래와 같은 의미가 된다.
//"id의 값이 egoing이고 password의 값이 111111이면 참이다"
//즉 and 연산자의 좌항과 우항이 모두 참일 때 전체가 참이 되는 것이다.

public class LoginDemo3 {

	public static void main(String[] args) {
		 String id = args[0];
	        String password = args[1];
	        if (id.equals("egoing") && password.equals("111111")) {
	            System.out.println("right");
	        } else {
	            System.out.println("wrong");
	        }
	}

}
