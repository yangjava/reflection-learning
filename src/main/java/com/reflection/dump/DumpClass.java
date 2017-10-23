package com.reflection.dump;

import com.reflection.ChildClass;

public class DumpClass {
	
	public static void main(String[] args) throws Exception {
		//第一种，如果编写代码的时候，就知道Class的名字，可以直接用如下方式得到Class对象：
		Class<ChildClass> clazz1=ChildClass.class;
		
		System.out.println(clazz1.getName());
		//com.reflection.ChildClass
		//第二种，如果在编写代码的时候，不知道类的名字，但是在运行时的时候，可以得到一个类名的字符串，可以用如下的方式获取Class对象：
		//注意，此方法需要有2个条件，第一，forName中的字符串必须是全限定名，
		//第二，这个Class类必须在classpath的路径下面，因为该方法会抛出`ClassNotFoundException`的异常。
		Class clazz2=Class.forName("com.reflection.ChildClass");
		
		System.out.println(clazz2.getName());
		
	}

}
