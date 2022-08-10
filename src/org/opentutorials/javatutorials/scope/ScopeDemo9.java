package org.opentutorials.javatutorials.scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
//        메소드 m 안에서 인스턴스 변수 v를 사용할 수 있게 되었다. 
//        this는 인스턴스 자신을 의미하는 키워드라고 할 수 있다.
        System.out.println(this.v);
    }
}
 
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();//10
    }
 
}
