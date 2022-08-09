package org.opentutorials.javatutorials.array;

//배열의 첫 번째 역할은 연관된 데이터를 저장하는 것이다. 
//데이터를 저장하는 컨테이너로서 배열의 면모를 잘 보여주고 있다. 
//저장했으면 저장한 것을 꺼내오는 이슈가 생긴다. 
//배열에 담겨있는 데이터를 꺼내오는 방법을 보여준다.

public class GetDemo {

	public static void main(String[] args) {
		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
//		classGroup[0] 처럼 배열이 담겨있는 변수의 이름 뒤에 대괄호를 붙이고 그 안에 0부터 시작하는 숫자를 입력하면 순차적으로 값을 가져올 수 있다.
	    System.out.println(classGroup[0]);
	    System.out.println(classGroup[1]);
	    System.out.println(classGroup[2]);
	    System.out.println(classGroup[3]);
	}

}
