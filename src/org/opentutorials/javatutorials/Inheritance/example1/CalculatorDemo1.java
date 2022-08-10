package org.opentutorials.javatutorials.Inheritance.example1;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

//이 클래스의 본체에는 sbstract라는 메소드만이 존재한다.
//extends Calculator : 클래스 Calculator를 상속 받는다는 의미다.
//SubstaractableCalculator는 Calculator에서 정의한 메소드 setOprands, sub, avg를 사용할 수 있게 된다.
//상속을 통해서 코드의 중복을 제거할 수 있었고, 또 부모 클래스을 개선하면 이를 상속받고 있는 모든 자식 클래스들에게 그 혜택이 자동으로 돌아간다. 
//다시 말해서 유지보수가 편리해진다는 것이다.
class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
//		c1은 아래와 같이 정의하지 않은 메소드들을 호출하고 있다.
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

	}

}
