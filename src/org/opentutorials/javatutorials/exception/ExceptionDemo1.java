package org.opentutorials.javatutorials.exception;

class A{
//	배열 arr은 3개의 값을 담을 수 있다.
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
//    public void z(int first, int second){
//        System.out.println(arr[first] / arr[second]);
//    }
//}
// 
//public class ExceptionDemo1 {
//    public static void main(String[] args) {
//        A a = new A();
////        10번째 인덱스를 호출하고 있다.
////        a.z(10, 1);
////        메소드 z 내부적으로 10/0을 실행하게 된다. 
////        0으로 나누는 것은 불가능하기 때문에 자바는 ArithmeticException을 발생시킨다.
//        a.z(1, 0);
//    }
    
    public void z(int first, int second){
//    	다중 catch를 보여준다. 
//    	조건문의 else if처럼 여러 개의 catch를 하나의 try 구문에서 사용할 수 있다. 
//    	이를 통해서 보다 간편하게 다양한 상황에 대응할 수 있다
//        try {
//            System.out.println(arr[first] / arr[second]);
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        } catch(ArithmeticException e){
//            System.out.println("ArithmeticException");
//        } catch(Exception e){
//            System.out.println("Exception");
//        }
        
//        Exception이 ArrayIndexOutOfBoundsException, ArithemeticException 보다 포괄적인 예외를 의미하기 때문에 Exception 이후에 등장하는 catch 문은 실행될 수 없는 구문이기 때문이다.
//        try {
//            System.out.println(arr[first] / arr[second]);
//        } catch(Exception e){
//        	System.out.println("Exception");
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        } catch(ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }
    	
//    	예외와 상관없이 try 내의 구문이 실행되면 finally가 실행되고 있다.
//    	예를 들어 데이터베이스를 사용한다면 데이터베이스 서버에 접속해야 한다. 
//    	이때 데이터베이스 서버와 여러분이 작성한 에플리케이션은 서로 접속상태를 유지하게 되는데 데이터베이스를 제어하는 과정에서 예외가 발생해서 더 이상 후속 작업을 수행하는 것이 불가능한 경우가 있을 수 있다. 
//    	예외가 발생했다고 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결 상태를 유지하게 되고 급기야 데이터베이스는 더 이상 접속을 수용할 수 없는 상태에 빠질 수 있다. 
//    	접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기에 좋은 작업이라고 할 수 있다. 
//    	말하자면 finally는 작업의 뒷정리를 담당한다고 볼 수 있다.
    	try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
         
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}
