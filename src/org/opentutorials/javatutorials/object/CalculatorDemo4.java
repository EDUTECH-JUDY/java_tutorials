package org.opentutorials.javatutorials.object;

//변수 left와 right, 메소드 sum과 avg는 연관되어 있는 로직이다. 
//이 로직들의 연관성은 계산을 하기 위한 것이다. 
//이 로직들을 대표하는 이름을 계산기라는 의미의 Calculator라고 정하고 이것들을 Calculator이라는 이름으로 그룹핑하고 싶다. 
//이럴 때 사용하는 키워드가 class이다. 
//class 키워드 뒤에는 클래스 이름이 오고 그 뒤의 중괄호는 클래스의 시작과 끝의 경계를 의미한다. 
//이렇게 해서 더하기(sum)와 평균(avg)를 계산 할 수 있는 클래스가 만들어졌다.
//클래스는 연관되어 있는 변수와 메소드의 집합이다.

class Calculator {
	int left, right;
	
//	인스턴스 C1과 C2는 아래와 같이 서로 다른 변수의 값을 내부적으로 가지고 있게 된다.
//	this는 클래스를 통해서 만들어진 인스턴스 자신을 가리킨다. 
//	left는 매개변수이고 이 변수는 setOprands 밖에서는 접근 할 수 없다. 
//	반면에 this.left는 선언한 변수에 값을 설정하는 것이고 메소드 밖에서 선언한 변수는 인스턴스 내의 모든 메소드에서 접근이 가능하다.
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo4 {	

	public static void main(String[] args) {
		
//		new Calculator()은 클래스 Calculator를 구체적인 제품으로 만드는 명령이다. 
//		이렇게 만들어진 구체적인 제품을 인스턴스(instance)라고 부른다. 
//		클래스 : 설계도
//		인스턴스 : 제품
//		new를 이용해서 만든 인스턴스를 변수 c1에 담고 있다. 
//		변수 c1에 인스턴스를 담은 이유는 c1을 통해서 인스턴스를 제어해야 하기 때문이다.
//		즉 클래스를 만든다는 것은 사용자 정의 데이터 타입을 만드는 것과 같은 의미다. 
//		클래스를 인스턴스화 할 때는 변수에 담아야 한다는 것과 이 때 사용하는 변수의 데이터 타입은 그 클래스가 된다는 점이다.
		
//		두개의 인스턴스를 각각 c1과 c2에 담았다. 
//		그리고 각각의 인스턴스에 소속된 메소드를 호출하고 있다. 
//		각각의 인스턴스는 메소드 setOprands를 통해서 변수 left, right의 값을 설정하고 있다.
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}

}
