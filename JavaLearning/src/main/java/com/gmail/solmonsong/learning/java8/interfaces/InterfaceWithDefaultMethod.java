package com.gmail.solmonsong.learning.java8.interfaces;

public interface InterfaceWithDefaultMethod {
	
	default String getString() {
		return "Default implementation";
	}
	
}
