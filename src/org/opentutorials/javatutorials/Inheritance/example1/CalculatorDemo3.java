package org.opentutorials.javatutorials.Inheritance.example1;

//곱하기가 가능한 클래스인 MultiplicationableCalculator을 상속받고 있다.
class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
    	DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
 
}
