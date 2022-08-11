package org.opentutorials.javatutorials.progenitor;

//import java.util.Objects;

//equals는 객체와 객체가 같은 것인지를 비교하는 API이다. 
//객체 간에 같고 다름은 필요에 따라서 달라질 수 있기 때문이다.

//class Student{
//    String name;
//    Student(String name){
//        this.name = name;
//    }
//@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name);
//	}
//}
// 
//class ObjectDemo {
// 
//    public static void main(String[] args) {
//        Student s1 = new Student("egoing");
//        Student s2 = new Student("egoing");
//        System.out.println(s1 == s2);//false
//        System.out.println(s1.equals(s2));//true
// 
//    }
// 
//}

//==================================================

//클래스 Student가 인터페이스 Cloneable을 구현하고 있는 것
//비어있는 인터페이스다. 
//그럼에도 불구하고 이것을 사용한 이유는 클래스 Student가 복제 가능하다는 것을 표시하기 위한 것이다. 
//만약 이 인터페이스를 구현하지 않고 있는 클래스에 대한 복제를 시도하면 오류가 발생할 것이다.
class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        try {
            Student s2 = (Student)s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
 
}
