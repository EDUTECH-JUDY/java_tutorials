package org.opentutorials.javatutorials.compare;

public class EqaulStringDemo {

	public static void main(String[] args) {
		String a = "Hello world";
        String b = new String("Hello world");
//      ==은 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해서 사용하는 연산자이기 때문에 b에 담긴 객체와 일치하지 않는 것이다.
        System.out.println(a == b);//false
        //.equals는 문자열을 비교할 때 사용하는 메소드다.
        System.out.println(a.equals(b));//true
	}

}
