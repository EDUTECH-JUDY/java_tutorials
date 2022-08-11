package org.opentutorials.javatutorials.abstractclass.example3;

//예제는 합계(sum)를 실행하고 평균(avg)을 실행하는 절차를 메소드 run을 통해서 한 번에 실행되도록 한 코드이다. 
//그런데 경우에 따라서 합계와 평균을 화면에 출력하는 모습을 달리해야 하는 경우가 있다고 치자. 
//그런 경우에 상황에 따라서 동작 방법이 달라지는 메소드(sum, avg)는 추상 메소드로 만들어서 하위 클래스에서 구현하도록 하고 모든 클래스의 공통분모(setOprands, run)의 경우에는 상위 클래스에 두어서 코드의 중복, 유지보수의 편의성 등을 꾀할 수 있다.

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
   
}