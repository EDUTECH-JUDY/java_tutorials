package org.opentutorials.javatutorials.array;

//for(String e : members)
//위의 구문은 배열 members의 값을 변수 e에 담아서 중괄호 구간 안으로 전달해준다. 
//반복문의 종료조건이나 종료조건을 위해서 기준값을 증가시키는 등의 반복적인 작업을 내부적으로 감춘 것이라고 할 수 있다. 
//자바 5.0부터 도입된 기능이다.

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }

	}

}
