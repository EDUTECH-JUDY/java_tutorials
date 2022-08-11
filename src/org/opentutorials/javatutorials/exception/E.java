package org.opentutorials.javatutorials.exception;

//class E{
//    void throwArithmeticException(){
//        throw new ArithmeticException();
//    }
//}

//unreported exception IOException; must be caught or declared to be thrown
//즉 IOException은 try...catch하거나 throw 해야 한다는 뜻이다.
//import java.io.IOException;
//class E{
//    void throwArithmeticException(){
//        throw new ArithmeticException();
//    }
//    void throwIOException(){
//        throw new IOException();
//    }
//}

import java.io.IOException;
class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}