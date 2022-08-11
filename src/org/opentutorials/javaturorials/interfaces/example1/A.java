package org.opentutorials.javaturorials.interfaces.example1;

interface I{
    public void z();
}

//클래스 A 뒤의 implements I는 이 클래스가 인터페이스 I를 구현하고 있다는 의미다.
//interface I의 맴버인 public void z() 메소드를 클래스 A가 반드시 포함하고 있어야 한다는 뜻이다.
class A implements I{
    public void z(){}
}
