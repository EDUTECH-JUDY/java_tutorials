package org.opentutorials.javatutorials.progenitor;

//class Calculator{
//    int left, right;
//      
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
//    public void sum(){
//        System.out.println(this.left+this.right);
//    }
//      
//    public void avg(){
//        System.out.println((this.left+this.right)/2);
//    }
//}
//  
//public class CalculatorDemo {
//      
//    public static void main(String[] args) {
//          
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 20);
//        클래스 Calculator의 인스턴스 c1을 화면에 출력하고 있다.
//        System.out.println(c1);//인스턴스 c1이 클래스 Calculator의 인스턴스라는 의미다. @ 뒤의 내용은 인스턴스에 대한 고유한 식별 값이라고 생각하자.
//    }
//  
//}

//=================================================

//클래스 Calculator에 toString을 재정의(overiding)했다. 
//그리고 인스턴스를 System.out.println의 인자로 전달하니까 toString을 명시적으로 호출하지 않았음에도 동일한 효과가 나고 있다. 
//toString은 객체를 문자로 표현하는 메소드이다. 
//toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출하면 자동으로 toString이 호출되도록 약속되어 있다.
//이를 통해서 인스턴스 c1의 상태를 쉽게 파악할 수 있게 되었다.
class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
     
    public String toString(){
        return "left : " + this.left + ", right : "+ this.right;
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1);
        System.out.println(c1.toString());
    }
  
}
