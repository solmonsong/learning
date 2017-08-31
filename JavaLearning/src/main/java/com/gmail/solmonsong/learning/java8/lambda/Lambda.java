package com.gmail.solmonsong.learning.java8.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

public class Lambda {
	
	public static Runnable getRunnablePrintlnHelloWorld() {
		return () -> System.out.println("Hello World");
	}
	
	public static BiConsumer<String, String> getBiConsumerPrintlnStrConcat() {
		return (a, b) -> System.out.println(String.format("%s%s", a, b));
	}
	
	public static BiFunction<String, String, String> getBiFunctionStrConcat() {
		return (a, b) -> String.format("%s%s", a, b);
	}
	
	public static BinaryOperator<Integer> getBinaryOperatorIntSum() {
		return (a, b) -> a + b;
	}
	
	public static BinaryOperator<String> getBinaryOperatorStrConcat() {
		return (a, b) -> String.format("%s%s", a, b);
	}
	
	public static BiPredicate<String, String> getBiPredicateCompareEquals() {
		return (a, b) -> a.equals(b);
	}
	
	public static BooleanSupplier getBooleanSupplierAlwaysTrue() {
		return () -> true;
	}
	
	public static Consumer<String> getConsumerPrintlnArg() {
		return (a) -> System.out.println(a);
	}
	
	public static DoubleBinaryOperator getDoubleBinaryOperatorSum() {
		return (a, b) -> a + b;
	}
	
	public static DoubleConsumer getDoubleConsumerPrintlnDouble() {
		return (a) -> System.out.printf("%f", a);
	}
	
	public static void main(String[] args) {
		System.out.println("Run tests through JUnit");
	}
	
}
