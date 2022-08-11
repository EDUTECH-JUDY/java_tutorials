package org.opentutorials.javatutorials.accessmodifier;

class Calculator{
//	이 두개의 변수는 객체 외부에서 호출될 필요가 없다. 
//	따라서 외부로부터 이 변수를 숨기기 위해서 접근 제어자로 private을 지정했다.
    private int left, right;
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
//    실제 계산은 이 메소드가 내부적으로 처리
    private int _sum(){
        return this.left+this.right;
    }
//    계산된 결과를 외부에 출력해주는 메소드는 sumDecoPlus, sumDecoMinus에서 처리
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}
  
public class CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}