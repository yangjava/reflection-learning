package com.reflection.dump;

public class DumpSuperclass {
	public static void main(String[] args) throws Exception {
		Class clazz2 = Class.forName("com.reflection.ChildClass");
		//得到包信息
		System.out.println(clazz2.getGenericSuperclass());
		
	}
}
