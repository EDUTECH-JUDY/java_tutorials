package org.opentutorials.javatutorials.scope;

//지역변수가 메소드 내에서만 접근이 가능함을 보여준다.
//title은 메소드 a에서만 유효하기 때문이다

public class ScopeDemo4 {

	static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
    }
}
