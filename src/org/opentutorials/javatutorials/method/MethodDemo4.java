package org.opentutorials.javatutorials.method;

public class MethodDemo4 {//01234
	
//	메소드 numbering의 괄호 안에 위치한 숫자 5는 이 메소드가 호출될 때 limit이라는 변수의 값이 된다. 
//	이 값은 메소드 numbering의 중괄호 안에서만 사용할 수 있다.
    
	public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
	
//	limit이라는 변수는 메소드 numbering의 정의 부에 있는 로직들에게 5라는 값을 전달하고 있다. 
//	호출에서 입력한 값을 로직으로 매개 한다는 의미에서 이러한 변수를 매개변수라고 부른다. 
//	영어로는 parameter다. 
//	그리고 메소드를 호출할 때 전달된 값인 5를 '인자' 영어로는 argument라고 한다.
	
//	public static void numbering() {
//	    int limit = 5;
//	    int i = 0;
//	    while (i < limit) {
//	        System.out.println(i);
//	        i++;
//	    }
//	}
 
    public static void main(String[] args) {
        numbering(5);
    }
	    
}

