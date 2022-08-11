package org.opentutorials.javatutorials.exception;
//오류 : 10을 0으로 나누려고 했기 때문

//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        System.out.print("계산결과는 ");
//        System.out.print(this.left/this.right);
//        System.out.print(" 입니다.");
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//오류 발생하지 않음 : try...catch 때문
//try...catch는 예외에서 핵심적인 역할을 담당하는 문법적인 요소
//try 안에는 예외 상황이 발생할 것으로 예상되는 로직을 위치시킨다. 
//예제에서는 사용자가 setOprands의 두 번째 인자로 숫자 0을 입력했을 때 문제가 발생할 수 있음을 예측할 수 있다. 
//그래서 이 로직을 try 구문으로 감싼 것이다.
//catch 안에는 예외가 발생했을 때 뒷수습을 하기 위한 로직이 위치한다. 
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        try {
//            System.out.print("계산결과는 ");
//            오류가 발생하면서 try 내의 실행이 중단되고 catch 구문 안의 내용이 실행되었음을 의미한다.
//            System.out.print(this.left/this.right);
//            System.out.print(" 입니다.");
//            e는 변수다. 
//            이 변수 앞의 Exception은 변수의 데이터 타입이 Exception이라는 의미다. 
//            Exception은 자바에서 기본적으로 제공하는 클래스로 java.lang에 소속되어 있다. 
//            예외가 발생하면 자바는 마치 메소드를 호출하듯이 catch를 호출하면서 그 인자로 Exception 클래스의 인스턴스를 전달하는 것이다.
//        } catch(Exception e){
//        	e.getMessage()는 자바가 전달한 인스턴스의 메소드 중 getMessage를 호출하는 코드인데, 
//        	getMessage는 오류의 원인을 사람이 이해하기 쉬운 형태로 리턴하도록 약속되어 있다.
//            System.out.println("오류가 발생했습니다 : "+e.getMessage());
//        }
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//         
//        Calculator c2 = new Calculator();
//        c2.setOprands(10, 5);
//        c2.divide();
//    }
//}

//=====================================================

//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        try {
//            System.out.print("계산결과는 ");
//            System.out.print(this.left/this.right);
//            System.out.print(" 입니다.");
//        } catch(Exception e){
//            System.out.println("\n\ne.getMessage()\n"+e.getMessage());//오류에 대한 기본적인 내용을 출력해준다. 상세하지 않다.
//            
//            e.toString()을 호출한 결과는 java.lang.ArithmeticException: / by zero 이다. 
//            e.toString()은 e.getMessage()보다 더 자세한 예외 정보를 제공한다. 
//            java.lang.ArithmeticException은 발생한 예외가 어떤 예외에 해당하는지에 대한 정보라고 지금을 생각하자. 
//            ArithmeticException 수학적인 계산의 과정에서 발생하는 예외상황을 의미한다.
//            System.out.println("\n\ne.toString()\n"+e.toString());
//           
//            메소드 getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다. 
//            이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다. 
//            printStackTrace는 가장 자세한 예외 정보를 제공한다.
//            System.out.println("\n\ne.printStackTrace()");
//            e.printStackTrace();
//        }
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//setOprands의 두번째 인자로 0이 들어오면 예외를 발생시킨다.
//두번째 인자의 값이 0이 되었을 때 setOprands의 사용자에게 예외 클래스인 IllegalArgumentException을 던지고 있다. 
//사용자인 main은 예외와 함께 '두번째 인자의 값은 0이 될 수 없습니다.'라는 메시지를 받게 되고 이 정보를 바탕으로 전달 값을 변경하게 된다.
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        if(right == 0){
//            throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
//        }
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        try {
//            System.out.print("계산결과는 ");
//            System.out.print(this.left/this.right);
//            System.out.print(" 입니다.");
//        } catch(Exception e){
//            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
//            System.out.println("\n\ne.toString()\n"+e.toString());
//            System.out.println("\n\ne.printStackTrace()");
//            e.printStackTrace();
//        }
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//메소드 divide를 실행할 때 right의 값이 0이라면 예외를 발생시킨다.
//throw는 예외를 발생시키는 명령이다. throw 뒤에는 예외 정보를 가지고 있는 예외 클래스가 위치한다. 
//자바 가상 머신은 이 클래스를 기준으로 어떤 catch 구문을 실행할 것인지를 결정한다. 
//또 실행되는 catch 구문에서는 예외 클래스를 통해서 예외 상황의 원인에 대한 다양한 정보를 얻을 수 있다.
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){        
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        if(this.right == 0){
//            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
//        }
//        try {
//            System.out.print("계산결과는 ");
//            System.out.print(this.left/this.right);
//            System.out.print(" 입니다.");
//        } catch(Exception e){
//            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
//            System.out.println("\n\ne.toString()\n"+e.toString());
//            System.out.println("\n\ne.printStackTrace()");
//            e.printStackTrace();
//        }
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//기존의 ArithmeticException을 직접 만든 Exception으로 교체해보자.
//class DivideException extends RuntimeException {
//    DivideException(){
//        super();
//    }
//    DivideException(String message){
//        super(message);
//    }
//}
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){        
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        if(this.right == 0){
//            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
//        }
//        System.out.print(this.left/this.right);
//    }
//}
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//만약 DivideException을 Exception으로 바꾸면 어떻게 될까? 
//class DivideException extends Exception {
//    DivideException(){
//        super();
//    }
//    DivideException(String message){
//        super(message);
//    }
//}
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){        
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        if(this.right == 0){
//            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");//컴파일 에러 발생
//        }
//        System.out.print(this.left/this.right);
//    }
//}
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//해결방법1 : 문법 예외처리
//class DivideException extends Exception {
//    DivideException(){
//        super();
//    }
//    DivideException(String message){
//        super(message);
//    }
//}
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){        
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        if(this.right == 0){
//            try {
//                throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
//            } catch (DivideException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.print(this.left/this.right);
//    }
//}
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}

//=====================================================

//해결방법2 : 사용자에게 예외를 던진다. 사용자는 반드시 예외에 대한 처리를 해야 한다.
class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException{
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}