package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	
//	변수 i는 위치적으로 어떠한 메소드의 소속도 아니다. 
//	클래스 ScopeDemo2의 직접적인 소속인 클래스 변수다. 
//	클래스 소속의 변수가 되면 모든 메소드에서 접근할 수 있게 된다. 
	
	 static int i;
     
	    static void a() {
	        i = 0;
	    }
	 
	    public static void main(String[] args) {
	        for (i = 0; i < 5; i++) {
//	        	메소드 a의 변수 i와 for문의 변수 i가 동시에 클래스 변수 i를 사용하게 된다는 의미다. 
//	        	그래서 반복문을 통해서 변수 i의 값을 아무리 바꿔도 메소드 a에 의해서 클래스 변수 i의 값이 0이 되기 때문에 반복문이 멈추지 않게 되는 것이다.
	            a();
	            System.out.println(i);
	        }
	    }
	 
	}
