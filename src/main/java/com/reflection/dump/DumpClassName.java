package com.reflection.dump;

public class DumpClassName {
	public static void main(String[] args) throws Exception {
		Class clazz2 = Class.forName("com.reflection.ChildClass");
        //类的名字有两种方式得到，一种是getName()  第一种得到的是全限定名
		System.out.println(clazz2.getName());
		//一种是getSimpleName() 第二种得到的是这个类的名字，不带包名
		System.out.println(clazz2.getSimpleName());
		
	}
}
