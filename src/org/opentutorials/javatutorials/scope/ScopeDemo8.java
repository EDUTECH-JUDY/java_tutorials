package org.opentutorials.javatutorials.scope;

//메소드 안에서 선언된 변수 v가 지역 변수가 되면서 인스턴스 전역에서 유효한 인스턴스 변수 v의 값보다 우선순위가 높아지면서 20이 출력된 것이다.

class C2 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(v);
    }
}
 
public class ScopeDemo8 {
 
    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();//20
    }
 
}
