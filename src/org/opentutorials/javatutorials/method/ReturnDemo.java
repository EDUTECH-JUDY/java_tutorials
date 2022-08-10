package org.opentutorials.javatutorials.method;

//return 은 메소드를 종료시키는 역할을 하므로 return이 처음 등장한 이후의 구문은 실행되지 않기 때문이다
		
public class ReturnDemo {
	 public static int one() {
	        return 1;
//	        return 2;
//	        return 3;
	    }

	public static void main(String[] args) {
		System.out.println(one());
	}

}
