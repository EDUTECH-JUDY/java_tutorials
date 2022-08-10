package org.opentutorials.javatutorials.io;

import java.util.Scanner;
import java.io.*;

//out.txt라는 파일을 입력 받아서 화면에 출력
//프로젝트의 루트 디렉토리(src와 bin 디렉토리가 위치하고 있는 경로)로 이동해서 
//out.txt 파일이 존재해야 한다.
//결과는 파일의 내용이 무엇인가에 따라서 달라질 것이다. 
//이 또한 분명한 입력값이다. 
//프로그램으로 유입되는 모든 정보는 입력값이다. 
 
public class Scanner3Demo {
 
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
         
    }
 
}
