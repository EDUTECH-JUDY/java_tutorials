package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
//	numbering이라는 이름의 메소드를 정의하고 있다.
	public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
//	main이라는 이름의 메소드 안에서 호출되고 있다.
	public static void main(String[] args) {
		numbering();
	}

}
