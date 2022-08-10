package org.opentutorials.javatutorials.method;

//하나의 메소드는 하나의 값만을 반환할 수 있기 때문에 위와 같이 각각의 회원정보를 반환하는 메소드

public class ReturnDemo3 {//최진혁 최유빈 한아람
	public static String getMember1() {
        return "최진혁";
    }
 
    public static String getMember2() {
        return "최유빈";
    }
 
    public static String getMember3() {
        return "한이람";
    }
 
    public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }

}
