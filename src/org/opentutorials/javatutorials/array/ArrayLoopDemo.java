package org.opentutorials.javatutorials.array;

//주목해야 할 것은 반복문과 배열을 결합한 부분이다. 
//반복문을 이용해서 배열 members의 내용을 하나씩 꺼낸 후에 상담 결과를 화면에 출력하고 있다. 
//배열이란 연관된 정보를 하나의 그룹으로 관리하기 위해서 사용하는데 그 정보를 처리 할 때는 반복문을 주로 이용한다. 
//반복문과 배열은 매우 밀접한 관계에 있다고 할 수 있다.

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다");
        }

	}

}
