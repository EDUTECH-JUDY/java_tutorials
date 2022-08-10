package org.opentutorials.javatutorials.method;

// 맴버를 담고 있는 배열을 반환하고 있다. 
//메소드 getMembers가 리턴한 배열을 members 변수에 담았다. 
//이 변수를 이용해서 여러 개의 데이터를 처리 할 수 있게 된다.

public class ReturnDemo4 {
	
	public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }

}
