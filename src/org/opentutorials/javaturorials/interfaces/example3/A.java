package org.opentutorials.javaturorials.interfaces.example3;

//클래스 A는 메소드 x나 z 중 하나라도 구현하지 않으면 오류가 발생한다.

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{
    public void x(){}
    public void z(){}   
}
