package org.opentutorials.javatutorials.io;

import java.util.Scanner;

//실행하고 숫자를 입력하면 입력한 숫자의 1000배가 출력 될 것이다. 
//sc.nextInt()가 실행되면 자바는 사용자의 입력이 있을 때까지 변수 i에 값을 할당하지 않고 대기상태에 있게 된다. 
//키보드로 데이터를 입력하고 엔터를 누르면 비로서 i에 값이 담기고 i*1000을 통해서 입력값에 1000이 곱해지고 그 결과가 화면에 출력된다. 

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i*1000);
		sc.close();
	}

}
