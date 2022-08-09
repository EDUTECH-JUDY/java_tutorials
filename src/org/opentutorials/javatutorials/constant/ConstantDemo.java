package org.opentutorials.javatutorials.constant;

public class ConstantDemo {

	public static void main(String[] args) {
//		"Type mismatch: cannot convert from double to float"
//		즉 2.2는 float가 아니라는 뜻이다.
//		float a = 2.2;
		
//		자바에서 실수형 상수는 double의 데이터 타입이다.
		double a = 2.2;
		
//		그럼 float 형 변수에는 어떻게 값을 대입할 수 있나?
//		2.2가 float 형이라는 것을 분명하게 명시해주면 된다.
		float b = 2.2F;
		
//		"The literal 2147483648 of type int is out of range"
//		변수는 long 타입이지만 이 변수에 대입되는 상수가 여전히 int 타입이기 때문에 int로 표현할 수 있는 최대 숫자를 여전히 초과하고 있다
//		long c = 2147483648;
		long c = 2147483648L;
		
//		자바는 byte와 short 타입에 대해서는 int 형을 허용하기 때문에 오류가 발생하지 않는다.
		byte d = 100;
		short e = 200;
		
//		double 타입의 변수 a에 float 타입의 값을 대입하고 있다. 
//		이 때 3.0F의 값은 자동으로 double 타입으로 형 변환이 일어난다. 
//		이것이 가능한 이유는 double 타입이 float 타입보다 더 많은 수를 표현 할 수 있기 때문이다. 
//		타입을 변경해도 정보의 손실이 일어나지 않는 경우 자동 형 변환이 일어난다.
		double f = 3.0F;
		
//		상수 3.0은 상수인데, 이 상수는 double 형이다. 
//		이 값을 표현 범위가 좁은 float에 넣으려고 하기 때문에 오류가 발생한다.
//		float a = 3.0;
		
//		자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용된다는 것이다.
		
//		우선 g와 h를 더하기 위해서 정수 g와 실수 h 중 하나가 형 변환을 해야 한다. 
//		int와 float가 붙으면 int가 float가 되기 때문에 변수 g에 담겨있는 값 3은 float 타입이 된다. 
//		연산 결과는 float 타입이다. 하지만 이 값이 담겨질 변수 i의 타입은 double이다. 
//		float가 double 타입의 변수에 담기기 위해서는 float가 double로 형 변환을 해야 한다. 
//		이렇게 해서 최종적으로 형 변환된 값이 변수 i에 담겼다.
		int g = 3;
		float h = 1.0F;
		double i = g + h;
		
//		자동 형 변환이 적용되지 않는 경우에는 수동으로 형 변환을 해야 한다. 
//		이를 명시적(Explicit Conversion)이라고 한다.
//		float j = 100.0;
//		int k = 100.0F;
		
		float l = (float)100.0;
		int m = (int)100.0F;

	}

}
