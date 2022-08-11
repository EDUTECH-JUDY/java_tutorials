package org.opentutorials.javaturorials.polymorphism;

//클래스 C의 데이터 타입으로 인터페이스 I가 될 수 있다는 점이다. 
//이것은 다중 상속이 지원되는 인터페이스의 특징과 결합해서 상속과는 다른 양상의 효과를 만들어낸다.

interface I{}
class C implements I{}
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        I obj = new C();
    }
}
