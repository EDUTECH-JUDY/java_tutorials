package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

//배열은 그 크기를 한번 지정하면 크기보다 많은 수의 값을 저장할 수 없다.
//public class ArrayListDemo {
 
//    public static void main(String[] args) {
//        String[] arrayObj = new String[2];
//        arrayObj[0] = "one";
//        arrayObj[1] = "two";
//        for(int i=0; i<arrayObj.length; i++){
//            System.out.println(arrayObj[i]);
//        }
//    }
//}

//=============================

//ArrayList는 크기를 미리 지정하지 않기 때문에 얼마든지 많은 수의 값을 저장할 수 있다.
//ArrayList는 배열과는 사용방법이 조금 다르다. 
//배열의 경우 값의 개수를 구할 때 .length를 사용했지만 ArrayList는 메소드 size를 사용한다. 
//또한, 특정한 값을 가져올 때 배열은 [인덱스 번호]를 사용했지만 컬렉션은 .get(인덱스 번호)를 사용한다.
//public class ArrayListDemo {
//	 
//    public static void main(String[] args) {
//    	
//        ArrayList al = new ArrayList();
//        al.add("one");
//        al.add("two");
//        al.add("three");
//        for(int i=0; i<al.size(); i++){
//            System.out.println(al.get(i));
//        }
//    } 
//}

//=============================

//ArrayList의 메소드 add의 입장에서는 인자로 어떤 형태의 값이 올지 알 수 없다. 
//그렇기 때문에 모든 데이터 타입의 조상인 Object 형식으로 데이터를 받고 있다.
//public class ArrayListDemo {
//	 
//    public static void main(String[] args) {
//    	
//        ArrayList al = new ArrayList();
//        al.add("one");
//        al.add("two");
//        al.add("three");
//        for(int i=0; i<al.size(); i++){
//            String val = al.get(i);//오류
//            System.out.println(val);
//        }
//    } 
//}

//=============================

//ArrayList 내에서 add를 통해서 입력된 값은 Object의 데이터 타입을 가지고 있고, 
//get을 이용해서 이를 꺼내도 Object의 데이터 타입을 가지고 있게 된다.
//get의 리턴값을 문자열로 형변환하고 있다. 원래의 데이터 타입이 된 것이다.
//public class ArrayListDemo {
//
//	public static void main(String[] args) {
//
//		ArrayList al = new ArrayList();
//		al.add("one");
//		al.add("two");
//		al.add("three");
//		for (int i = 0; i < al.size(); i++) {
//			String val = (String) al.get(i);
//			System.out.println(val);
//		}
//	}
//}
	
//=============================
	
//제네릭 사용
//제네릭을 사용하면 ArrayList 내에서 사용할 데이터 타입을 인스턴스를 생성할 때 지정할 수 있기 때문에 데이터를 꺼낼 때(String val = al.get(i);) 형변환을 하지 않아도 된다.
public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		for(int i=0; i<al.size(); i++){
		    String val = al.get(i);
		    System.out.println(val);
		}
	}
}	
