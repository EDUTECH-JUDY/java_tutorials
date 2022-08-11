package org.opentutorials.javaturorials.finals;

//Calculator.PI를 통해서 클래스 변수 PI의 값을 변경하려고 하고 있지만 자바는 이것을 허용하지 않는다. 
//final로 지정된 변수에는 한번 값이 할당되면 그 값을 바꿀 수 없기 때문이다.

class Calculator {
//	변수 앞에 final이 붙어있다
    static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
//        Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
 
    }
 
}
