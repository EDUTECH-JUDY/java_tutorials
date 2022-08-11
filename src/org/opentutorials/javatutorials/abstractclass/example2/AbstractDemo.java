package org.opentutorials.javatutorials.abstractclass.example2;

abstract class A{
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
//클래스 B는 클래스 A를 상속했다. 
//그리고 클래스 A의 추상 메소드인 메소드 b를 오버라이딩하고 있다. 
//그 결과 클래스 A를 사용할 수 있었다.
class B extends A{
    public int b(){return 1;}
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}
