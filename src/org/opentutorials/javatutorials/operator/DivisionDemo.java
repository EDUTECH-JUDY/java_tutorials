package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
        
//      정수와 정수를 나눈 것이다. 3은 나머지의 몫이고, 나머지는 버려졌다. 
//      정수는 소수점을 표현할 수 없으므로 정수만 표시된 것이다.
        System.out.println(a/b);
        
        System.out.println(c/d);//10.0 / 3.0
        
//      정수에서 실수를 나눈 것이다. 이 경우 암시적으로 형 변환이 일어나기 때문에 정수가 실수가 된다.
        System.out.println(a/d);
	}

}
