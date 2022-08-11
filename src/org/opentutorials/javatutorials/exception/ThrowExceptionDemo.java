package org.opentutorials.javatutorials.exception;

//ThrowExceptionDemo.main(클래스 ThrowExceptionDem의 메소드 main)은 C.run의 사용자이다. 
//C.run은 B.run의 사용자이다. 
//반대로 B.run의 다음 사용자는 C.run이고 C.run의 다음 사용자는 ThrowExceptionDem.main이 되는 셈이다.

//class B{
//    void run(){
//    }
//}
//class C{
//    void run(){
//        B b = new B();
//        b.run();
//    }
//}
//public class ThrowExceptionDemo {
//    public static void main(String[] args) {
//         C c = new C();
//         c.run();
//    }   
//}

import java.io.*;

//B.run이 FileReader의 생성자와 BufferedReader.readLine가 던진 예외를 try...catch로 처리한다. 
//즉 B.run이 예외에 대한 책임을 지고 있다.
//class B{
//    void run(){
//        BufferedReader bReader = null;
//        String input = null;
//        try {
//            bReader = new BufferedReader(new FileReader("out.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try{
//            input = bReader.readLine();
//        } catch (IOException e){
//            e.printStackTrace();
//        }       
//        System.out.println(input); 
//    }
//}
//class C{
//    void run(){
//        B b = new B();
//        b.run();
//    }
//}
//public class ThrowExceptionDemo {
//    public static void main(String[] args) {
//         C c = new C();
//         c.run();
//    }   
//}

//	B 내부의 try...catch 구문은 제거되었고 run 옆에 throws IOException, FileNotFoundException이 추가되었다. 
//	이것은 B.run 내부에서 IOException, FileNotFoundException에 해당하는 예외가 발생하면 이에 대한 처리를 B.run의 사용자에게 위임하는 것이다. 
//	코드에서 B.run의 사용자는 C.run이다.
//class B{
//    void run() throws IOException, FileNotFoundException{
//        BufferedReader bReader = null;
//        String input = null;
//        bReader = new BufferedReader(new FileReader("out.txt"));
//        input = bReader.readLine();
//        System.out.println(input); 
//    }
//}
//class C{
//    void run(){
//        B b = new B();
//        b.run();
//    }
//}
//public class ThrowExceptionDemo {
//    public static void main(String[] args) {
//         C c = new C();
//         c.run();
//    }   
//}

//class B{
//    void run() throws IOException, FileNotFoundException{
//        BufferedReader bReader = null;
//        String input = null;
//        bReader = new BufferedReader(new FileReader("out.txt"));
//        input = bReader.readLine();
//        System.out.println(input);
//    }
//}
//class C{
//    void run(){
//        B b = new B();
//        try {
//            b.run();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//public class ThrowExceptionDemo {
//    public static void main(String[] args) {
//         C c = new C();
//         c.run();
//    }   
//}

class B{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

//out.txt 파일을 찾을 수 없는 상황은 B.run 입장에서는 어떻게 할 수 있는 일이 아니다. 
//엔드유저인 애플리케이션의 사용자가 out.txt 파일을 루트 디렉토리에 위치시켜야 하는 문제이기 때문에 애플리케이션의 진입점인 메소드 main으로 책임을 넘기고 있다.
class C{
    void run() throws IOException, FileNotFoundException{
        B b = new B();
        b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         try {
            c.run();
        } catch (FileNotFoundException e) {
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}