package org.opentutorials.javatutorials.generic;

//p1.info와 p2.info의 데이터 타입은 결과적으로 아래와 같다.
//p1.info : String
//p2.info : StringBuilder
//그것은 각각의 인스턴스를 생성할 때 사용한 <> 사이에 어떤 데이터 타입을 사용했느냐에 달려있다. 

//class Person<T>{
//	클래스 Person의 필드 info의 데이터 타입은 T로 되어 있다. 
//	그런데 T라는 데이터 타입은 존재하지 않는다. 
//	이 값은 아래 코드의 T에서 정해진다.
//    public T info;
//}
 
//public class GenericDemo {
 
//    public static void main(String[] args) {
//    	변수 p1의 데이터 타입을 정의하고 있다.
//        Person<String> p1 = new Person<String>();
//        Person<StringBuilder> p2 = new Person<StringBuilder>();
//    }
//}

//===============================================

///class StudentInfo{
//  public int grade;
//  StudentInfo(int grade){ this.grade = grade; }
//}
//class StudentPerson{
//  public StudentInfo info;
//  StudentPerson(StudentInfo info){ this.info = info; }
//}
//class EmployeeInfo{
//  public int rank;
//  EmployeeInfo(int rank){ this.rank = rank; }
//}
//class EmployeePerson{
//  public EmployeeInfo info;
//  EmployeePerson(EmployeeInfo info){ this.info = info; }
//}
//public class GenericDemo {
//  public static void main(String[] args) {
//      StudentInfo si = new StudentInfo(2);
//      StudentPerson sp = new StudentPerson(si);
//      System.out.println(sp.info.grade); // 2
//      EmployeeInfo ei = new EmployeeInfo(1);
//      EmployeePerson ep = new EmployeePerson(ei);
//      System.out.println(ep.info.rank); // 1
//  }
//}

//===============================================

//중복제거
//class StudentInfo{
//  public int grade;
//  StudentInfo(int grade){ this.grade = grade; }
//}
//class EmployeeInfo{
//  public int rank;
//  EmployeeInfo(int rank){ this.rank = rank; }
//}
//클래스 Person의 생성자는 매개변수 info의 데이터 타입이 Object이다. 
//따라서 모든 객체가 될 수 있다. 
//그렇기 때문에 위와 EmployeeInfo의 객체가 아니라 String이 와도 컴파일 에러가 발생하지 않는다. 
//대신 런타임 에러가 발생한다. 컴파일 언어의 기본은 모든 에러는 컴파일이 발생할 수 있도록 유도해야 한다는 것이다. 
//런타임은 실제로 애플리케이션이 동작하고 있는 상황이기 때문에 런타임에 발생하는 에러는 항상 심각한 문제를 초래할 수 있기 때문이다. 
//class Person{
//  public Object info;
//  Person(Object info){ this.info = info; }
//}
//public class GenericDemo {
//  public static void main(String[] args) {
//      Person p1 = new Person("부장");
//      EmployeeInfo ei = (EmployeeInfo)p1.info;
//      System.out.println(ei.rank);
//  }
//}

//===============================================

//제네릭으로 바꿔보자
//class StudentInfo{
//    public int grade;
//    StudentInfo(int grade){ this.grade = grade; }
//}
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T>{
//    public T info;
//    Person(T info){ this.info = info; }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
//        EmployeeInfo ei1 = p1.info;
//        System.out.println(ei1.rank); // 성공
         
//        p2는 컴파일 오류가 발생하는데 p2.info가 String이고 String은 rank 필드가 없는데 이것을 호출하고 있기 때문이다.
//        Person<String> p2 = new Person<String>("부장");
//        String ei2 = p2.info;
//        System.out.println(ei2.rank); // 컴파일 실패
//    }
//}

//===============================================

//클래스 내에서 여러개의 제네릭을 필요로 하는 경우
//즉, 복수의 제네릭을 사용할 때는 <T, S>와 같은 형식을 사용한다. 
//여기서 T와 S 대신 어떠한 문자를 사용해도 된다. 하지만 묵시적인 약속(convention)이 있기는 하다.
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T, S>{
//    public T info;
//    public S id;
//    Person(T info, S id){ 
//        this.info = info; 
//        this.id = id;
//    }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1), 1);//오류발생
//    }
//}

//===============================================

//오류 해결 : 제네릭은 참조 데이터 타입에 대해서만 사용할 수 있다. 기본 데이터 타입에서는 사용할 수 없다.
//new Integer는 기본 데이터 타입인 int를 참조 데이터 타입으로 변환해주는 역할을 한다.
//이러한 클래스를 래퍼(wrapper) 클래스라고 한다. 
//덕분에 기본 데이터 타입을 사용할 수 없는 제네릭에서 int를 사용할 수 있다.
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T, S>{
//    public T info;
//    public S id;
//    Person(T info, S id){ 
//        this.info = info;
//        this.id = id;
//    }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        EmployeeInfo e = new EmployeeInfo(1);
//        Integer i = new Integer(10);
//        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
//        System.out.println(p1.id.intValue());
//    }
//}

//===============================================

//제네릭의 생략
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T, S>{
//    public T info;
//    public S id;
//    Person(T info, S id){ 
//        this.info = info;
//        this.id = id;
//    }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        EmployeeInfo e = new EmployeeInfo(1);
//        Integer i = new Integer(10);
//        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
//        Person p2 = new Person(e, i);
//    }
//}

//===============================================

//메소드에 적용
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T, S>{
//    public T info;
//    public S id;
//    Person(T info, S id){ 
//        this.info = info;
//        this.id = id;
//    }
//    public <U> void printInfo(U info){
//        System.out.println(info);
//    }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        EmployeeInfo e = new EmployeeInfo(1);
//        Integer i = new Integer(10);
//        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
//        p1.<EmployeeInfo>printInfo(e);
//        p1.printInfo(e);
//    }
//}

//===============================================

//extends : 제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있다.
//abstract class Info{
//    public abstract int getLevel();
//}
//class EmployeeInfo extends Info{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//    public int getLevel(){
//        return this.rank;
//    }
//}
//class Person<T extends Info>{
//    public T info;
//    Person(T info){ this.info = info; }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
//        Person<String> p2 = new Person<String>("부장");//즉 Person의 T는 Info 클래스나 그 자식 외에는 올 수 없다.
//    }
//}

//extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있다.
interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
    }
}