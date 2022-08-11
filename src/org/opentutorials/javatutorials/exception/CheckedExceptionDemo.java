package org.opentutorials.javatutorials.exception;

import java.io.*;

//public class CheckedExceptionDemo {
//    public static void main(String[] args) {
////    	Unhandled exception type FileNotFoundException
////    	이것은 아래 로직에 대한 예외처리가 필요하다는 뜻이다.
//        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
//        String input = bReader.readLine();
//        System.out.println(input); 
//    }
//}

//public class CheckedExceptionDemo {
//    public static void main(String[] args) {
//        try {
//            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
////        BufferedReader 클래스의 readLine 메소드는 IOException을 발생시킬 수 있다.
//        String input = bReader.readLine();
//        System.out.println(input); 
//    }
//}

//public class CheckedExceptionDemo {
//    public static void main(String[] args) {
//        try {
//            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try{
////        	선언된 bReader에 접근할 수 없다.
//            String input = bReader.readLine();
//        } catch (IOException e){
//            e.printStackTrace();
//        }       
//        System.out.println(input); 
//    }
//}

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 
    }
}