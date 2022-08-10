package org.opentutorials.javatutorials.datatype;

public class IntDatatypeDemo {

	public static void main(String[] args) {
		byte a;//-128~127
		short b;//2byte
		int c;//4byte
		long d;//8byte
		
//		변수 e와 변수 f는 둘 다 똑같이 8byte의 메모리를 사용하게 된다. 데이터 타입이 같기 때문이다.
		long e = 2147483647;
		long f = 1;
		
//		변수 g와 변수 h는 똑같은 수를 저장하고 있지만, 변수 h가 2배의 메모리를 사용한다. 데이터 타입이 다르기 때문이다.
		int g = 2147483647;
		long h = 2147483647;		
	}

}
