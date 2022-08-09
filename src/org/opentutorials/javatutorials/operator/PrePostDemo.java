package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
//		++는 자신과 결합되어 있는 항의 값에 1을 더하는 연산을 한다.
        i++;//i = i + 1;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        
//      ++i는 i의 값에 1이 더해진 값을 출력하는 것이고, 
//      i++는 이것이 속해있는 println에 일단 현재 i의 값을 출력하고, 
//      println의 실행이 끝난 후에 i의 값이 증가하는 특성이 있다.
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
	}

}
