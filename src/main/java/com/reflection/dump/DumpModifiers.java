package com.reflection.dump;

import java.lang.reflect.Modifier;

public class DumpModifiers {
	public static void main(String[] args) throws Exception {
		Class clazz2 = Class.forName("com.reflection.ChildClass");
		int modifiers=clazz2.getModifiers();
		Modifier.isAbstract(modifiers);
		Modifier.isFinal(modifiers);
		Modifier.isInterface(modifiers);
		Modifier.isNative(modifiers);
		Modifier.isPrivate(modifiers);
		Modifier.isProtected(modifiers);
		Modifier.isPublic(modifiers);
		Modifier.isStatic(modifiers);
		Modifier.isStrict(modifiers);
		Modifier.isSynchronized(modifiers);
		Modifier.isTransient(modifiers);
		Modifier.isVolatile(modifiers);
	}

}
