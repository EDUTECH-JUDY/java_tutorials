package org.opentutorials.javatutorials.abstractclass.example1;

//메소드 b의 선언 부분에는 abstract라는 키워드가 등장하고 있다. 
//이 키워드는 메소드 b는 메소드의 시그니처만 정의 되어 있고 이 메소드의 구체적인 구현은 하위 클래스에서 오버라이딩 해야 한다는 의미다. 
//이렇게 내용이 비어있는 메소드를 추상 메소드라고 부른다. 
//추상 메소드를 하나라도 포함하고 있는 클래스는 추상 클래스가 되고, 자연스럽게 클래스의 이름 앞에 abstract가 붙는다. 

abstract class A{
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
//    	 추상 클래스 A를 인스턴스화하면 오류가 발생한다. 
//    	그것은 추상 클래스는 구체적인 메소드의 내용이 존재하지 않기 때문에 인스턴스화시켜서 사용할 수 없기 때문이다.
//        A obj = new A();
    }
}
