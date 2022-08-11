package org.opentutorials.javatutorials.accessmodifier.outter;

import org.opentutorials.javatutorials.accessmodifier.inner.PublicClass;

public class ClassAccessModifierOuterPackage {
	PublicClass publicClass = new PublicClass();
//	주석으로 처리한 부분은 오류가 발생한다. 
//	DefaultClass의 접근 제어자가 default이기 때문이다.
//	DefaultClass defaultClass = new DefaultClass();
}
