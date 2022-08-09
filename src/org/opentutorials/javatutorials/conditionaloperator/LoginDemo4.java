package org.opentutorials.javatutorials.conditionaloperator;

//or와 and를 혼합해서 사용하는 방법을 보여준다. 
//id 값을 테스트하는 구간을 괄호()로 묶었다. 
//사용자가 id의 값으로 egoing 비밀번호를 111111을 입력했다면 연산의 순서는 아래와 같이 된다.
//
//(id=="egoing" or id=="k8805" or id=="sorialgi") : true가 된다.
//password=='111111' : true가 된다.
//true(1항) and true(2항) : true가 된다.
//사칙 연산을 할 때 괄호부터 계산하는 것과 같은 원리다.

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
        String password = args[1];
        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))
                && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}

}
