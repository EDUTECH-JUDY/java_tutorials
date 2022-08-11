package org.opentutorials.javatutorials.accessmodifier;

class A {
    public String y(){
        return "public void y()";
    }
//    메소드가 키워드 private으로 시작되고 있다. 
//    private은 클래스(A) 밖에서는 접근 할 수 없다는 의미다. 
//    바로 이 private의 자리에 오는 것들을 접근 제어자(access modifier)라고 한다. 
//    그럼 사용할 수 없는 메소드를 왜 정의하고 있는 것일까? 
//    내부적으로 사용하기 위해서다.
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());
    }
}