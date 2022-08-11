package org.opentutorials.javatutorials.collection;

import java.util.*;

//Map에서 데이터를 추가할 때 사용하는 API는 put이다. 
//put의 첫번째 인자는 값의 key이고, 두번째 인자는 key에대한 값이다. key를 이용해서 값을 가져올 수 있다.

public class MapDemo {
 
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
//    	 HashMap은 Map 인터페이스를 구현하기 때문에 변수 a의 데이터 타입으로 Map을 사용할 수 있다.
//        Map<String, Integer> a = new HashMap<String, Integer>();
//        Map<String, Integer> a = new Hashtable<String, Integer>();
        
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
         
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }
    
//    메소드 entrySet은 Map의 데이터를 담고 있는 Set을 반환한다. 
//    반환한 Set의 값이 사용할 데이터 타입은 Map.Entry이다. 
//    - getKey
//    - getValue
//    위의 API를 이용해서 Map의 key, value를 조회할 수 있다.
     
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
     
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
 
}
