package org.opentutorials.javaturorials.polymorphism;

//클래스 B의 데이터 형이 클래스 A이다. 클래스 B는 클래스 A를 상속하고 있다. 
//이런 경우에 클래스 B는 클래스 A를 데이터 형으로 삼을 수 있다. 

//class A{}
//class B extends A{}
//public class PolymorphismDemo1 {
//    public static void main(String[] args) {
//        A obj = new B();
//    }
//}

//class A{
//    public String x(){return "x";}
//}
//class B extends A{
//    public String y(){return "y";}
//}
//public class PolymorphismDemo1 {
//    public static void main(String[] args) {
////    	즉 클래스 B의 데이터 형을 클래스 A로 하면 클래스 B는 마치 클래스 A인것처럼 동작하게 되는 것이다. 
////    	클래스 B를 사용하는 입장에서는 클래스 B를 클래스 A인것처럼 사용하면 된다. 
////      A obj = new B();
//    	B obj = new B();
//        obj.x();
////      클래스 B는 메소드 y를 가지고 있다.
////      그럼에도 불구하고 메소드 y가 마치 존재하지 않는 것처럼 실행되지 않고 있다.
//        obj.y();
//    }
//}

//class A{
//    public String x(){return "A.x";}
//}
//class B extends A{
////	클래스 E의 메소드 x를 클래스 F에서 오버라이딩하고 있다.
//    public String x(){return "B.x";}
//    public String y(){return "y";}
//}
//public class PolymorphismDemo1 {
//    public static void main(String[] args) {
//        A obj = new B();
//        System.out.println(obj.x());
//    }
//}

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
//    	서로 다른 클래스 H와 B2가 동일한 데이터 타입 G로 인스턴스화 되었다.
//    	하지만 두 인스턴스의 메소드 x를 호출한 결과는 서로 다르다.
//    	이것이 상속과 오버라이딩 그리고 형변환을 이용한 다형성이다.
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}