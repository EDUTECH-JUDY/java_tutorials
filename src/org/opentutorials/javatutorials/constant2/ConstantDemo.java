package org.opentutorials.javatutorials.constant2;

//숫자 1에 해당하는 과일은 언제나 사과여야 한다. 
//그러므로 변하지 않는 값인 상수값에 따라서 그 값에 해당하는 과일의 의미를 고정하고 있다. 
//그런데 주석으로 상수의 의미를 전달하고 있지만 주석이 없어졌거나, 주석이 상수를 사용하는 코드와 멀어진다면 각 숫자에 해당하는 과일이 무엇을 나타내는지 알아보기거 어렵거나 불가능해질 수 있다.

//public class ConstantDemo {
//    public static void main(String[] args) {
//        /*
//         * 1. 사과
//         * 2. 복숭아
//         * 3. 바나나
//         */
//        int type = 1;
//        switch(type){
//            case 1:
//                System.out.println(57);
//                break;
//            case 2:
//                System.out.println(34);
//                break;
//            case 3:
//                System.out.println(93);
//                break;
//        }
//    }
// 
//}

//===================================================

//변수도 상수가 될 수 있다. 
//변수를 지정하고 그 변수를 final로 처리하면 한번 설정된 변수의 값은 더 이상 바뀌지 않는다. 
//또한 바뀌지 않는 값이라면 인스턴스 변수가 아니라 클래스 변수(static)로 지정하는 것이 더 좋을 것이다.

//public class ConstantDemo {
//    private final static int APPLE = 1;
//    private final static int PEACH = 2;
//    private final static int BANANA = 3;
//    public static void main(String[] args) {
//        int type = APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//프로그램이 커지면서 누군가 기업에 대한 상수가 필요해졌다.
//과일 APPLE과 기업 APPLE이 서로 같은 이름을 가진다. 
//이렇게 되면 APPLE의 값이 2에서 1로 바뀐다. 프로그램은 오동작 할 것이다. 
//다행인 것은 final로 선언했기 때문에 컴파일이 되지 않고 이름이 중복되는 문제를 방지 할 수 있다. 
//그런데 이미 기업에 대한 상수를 작성했고 이것이 이미 다양한 영역에서 사용되고 있는 상태에서 APPLE을 추가하려면 낭패가 될 것이다.

//public class ConstantDemo {
//    // fruit
//    private final static int APPLE = 1;
//    private final static int PEACH = 2;
//    private final static int BANANA = 3;
//     
//    // company
//    private final static int GOOGLE = 1;
//    //private final static int APPLE = 2;
//    private final static int ORACLE = 3;
//     
//    public static void main(String[] args) {
//        int type = APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//접두사를 붙여보자.
//이러한 기법을 네임스페이스라고 한다. 
//그런데 상수가 너무 지저분하다. 
//좀 깔끔하게 바꿀 수 없을까? 
//이럴 때 인터페이스를 사용할 수 있다.
//public class ConstantDemo {
//    // fruit
//    private final static int FRUIT_APPLE = 1;
//    private final static int FRUIT_PEACH = 2;
//    private final static int FRUIT_BANANA = 3;
//     
//    // company
//    private final static int COMPANY_GOOGLE = 1;
//    private final static int COMPANY_APPLE = 2;
//    private final static int COMPANY_ORACLE = 3;
//     
//    public static void main(String[] args) {
//        int type = FRUIT_APPLE;
//        switch(type){
//            case FRUIT_APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case FRUIT_PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case FRUIT_BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//인터페이스 사용
//접미사(FRUIT_, COMPANY_)로 이름을 구분했던 부분이 인터페이스로 구분되기 때문에 언어의 특성을 보다 잘 살린 구조가 되었다. 
//인터페이스를 이렇게 사용할 수 있는 것은 인터페이스에서 선언된 변수는 무조건 public static final의 속성을 갖기 때문이다.

//interface FRUIT{
//    int APPLE=1, PEACH=2, BANANA=3;
//}
//interface COMPANY{
//    int GOOGLE=1, APPLE=2, ORACLE=3;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//        int type = FRUIT.APPLE;
//        switch(type){
//            case FRUIT.APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case FRUIT.PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case FRUIT.BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//그런데 type의 값으로 누군가 COMPANY_GOOGLE을 사용했다면 어떻게 될까?
//서로 다른 상수그룹의 비교를 시도했고 양쪽 모두 값이 정수 1이기 때문에 오류를 사전에 찾아주지 못하고 있다.
//interface FRUIT{
//    int APPLE=1, PEACH=2, BANANA=3;
//}
//interface COMPANY{
//    int GOOGLE=1, APPLE=2, ORACLE=3;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//    	int type = COMPANY.GOOGLE;
//        switch(type){
//            case FRUIT.APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case FRUIT.PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case FRUIT.BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//컴파일러가 이런 실수를 사전에 찾아줄 수 있게 하기
//Fruit와 Company 클래스를 만들고 클래스 변수로 해당 클래스의 인스턴스를 사용하고 있다. 
//각각의 변수가 final이기 때문에 불변이고, Static이므로 인스턴스로 만들지 않아도 된다. 
//서로 다른 카테고리의 상수에 대해서는 비교조차 금지하게 된 것이다. 
//언제나 오류는 컴파일 시에 나타나도록 하는 것이 바람직하다. 
//그런데 두 가지 문제점이 있는데 하나는 switch 문에서 사용할 수 없고(if문은 가능) 또 하나는 선언이 너무 복잡하다는 것이다.

//class Fruit{
//    public static final Fruit APPLE  = new Fruit();
//    public static final Fruit PEACH  = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//}
//class Company{
//    public static final Company GOOGLE = new Company();
//    public static final Company APPLE = new Company();
//    public static final Company ORACLE = new COMPANY(Company);
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//        if(Fruit.APPLE == Company.APPLE){
//            System.out.println("과일 애플과 회사 애플이 같다.");
//        }
//    }
//}

//===================================================

//enum은 열거형(enumerated type)이라고 부른다. 
//열거형은 서로 연관된 상수들의 집합이라고 할 수 있다. 
//Fruit와 Company가 말하자면 열거인 셈이다.

//enum은 class, interface와 동급의 형식을 가지는 단위다. 
//하지만 enum은 사실상 class이다. 편의를 위해서 enum만을 위한 문법적 형식을 가지고 있기 때문에 구분하기 위해서 enum이라는 키워드를 사용하는 것이다. 

//enum Fruit{
//    APPLE, PEACH, BANANA;
//}
//enum Company{
//    GOOGLE, APPLE, ORACLE;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//        
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//Call Constructor가 출력된 것은 생성자 Fruit가 호출되었음을 의미한다. 
//이것이 3번 호출되었다는 것은 필드의 숫자만큼 호출되었다는 뜻이다. 
//즉 enum은 생성자를 가질 수 있다.

//enum Fruit{
//    APPLE, PEACH, BANANA;
//    Fruit(){
//        System.out.println("Call Constructor "+this);
//    }
//}
// 
//enum Company{
//    GOOGLE, APPLE, ORACLE;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//     
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//enum의 생성자가 접근 제어자 private만을 허용하기 때문이다. 
//덕분에 Fruit를 직접 생성할 수 없다.

//enum Fruit{
//    APPLE, PEACH, BANANA;
//    public Fruit(){
//        System.out.println("Call Constructor "+this);
//    }
//}
// 
//enum Company{
//    GOOGLE, APPLE, ORACLE;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//     
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case BANANA:
//                System.out.println(93+" kcal");
//                break;
//        }
//    }
//}

//===================================================

//enum Fruit{
//	 Fruit의 상수를 선언하면서 동시에 생성자를 호출하고 있다.
//    APPLE("red"), PEACH("pink"), BANANA("yellow");
//    public String color;
//    생성자
//    생성자의 매개변수로 전달된 값은 this.color를 통해서 인스턴스 변수의 값으로 할당된다.
//    Fruit(String color){
//        System.out.println("Call Constructor "+this);
//        this.color = color;
//    }
//}
// 
//enum Company{
//    GOOGLE, APPLE, ORACLE;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//       
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//            	APPLE에 할당된 Fruit 인스턴스의 color 필드를 반환하게 된다.
//                System.out.println(57+" kcal, "+Fruit.APPLE.color);
//                break;
//            case PEACH:
//                System.out.println(34+" kcal"+Fruit.PEACH.color);
//                break;
//            case BANANA:
//                System.out.println(93+" kcal"+Fruit.BANANA.color);
//                break;
//        }
//    }
//}

//===================================================

//열거형은 메소드를 가질수도 있다.

//enum Fruit{
//    APPLE("red"), PEACH("pink"), BANANA("yellow");
//    private String color;
//    Fruit(String color){
//        System.out.println("Call Constructor "+this);
//        this.color = color;
//    }
//    String getColor(){
//        return this.color;
//    }
//}
// 
//enum Company{
//    GOOGLE, APPLE, ORACLE;
//}
// 
//public class ConstantDemo {
//     
//    public static void main(String[] args) {
//        Fruit type = Fruit.APPLE;
//        switch(type){
//            case APPLE:
//                System.out.println(57+" kcal, "+Fruit.APPLE.getColor());
//                break;
//            case PEACH:
//                System.out.println(34+" kcal"+Fruit.PEACH.getColor());
//                break;
//            case BANANA:
//                System.out.println(93+" kcal"+Fruit.BANANA.getColor());
//                break;
//        }
//    }
//}

//===================================================

//enum은 맴버 전체를 열거 할 수 있는 기능도 제공한다.

enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo {
     
    public static void main(String[] args) {
        for(Fruit f : Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }
    }
}