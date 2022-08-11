package org.opentutorials.javaturorials.finals;

//final 메소드 b를 상속하려하기 때문에 오류가 발생한다.

class A{
    final void b(){}
}
class B extends A{
//    void b(){}
}
