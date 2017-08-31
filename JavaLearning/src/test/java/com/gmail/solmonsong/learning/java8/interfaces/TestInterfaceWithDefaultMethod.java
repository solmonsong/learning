package com.gmail.solmonsong.learning.java8.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInterfaceWithDefaultMethod {
	
	@Test
	public void testImplementationOfInterfaceWithDefaultMethod() {
		ImplementationOfInterfaceWithDefaultMethod object = new ImplementationOfInterfaceWithDefaultMethod();
		String result = object.getString();
		assertEquals("Default implementation", result);
	}
	
	@Test
	public void testImplementationOfInterfaceWithDefaultMethodOverwritten() {
		ImplementationOfInterfaceWithDefaultMethodOverwritten object = new ImplementationOfInterfaceWithDefaultMethodOverwritten();
		String result = object.getString();
		assertEquals("Overwritten default method", result);
	}
	
}
