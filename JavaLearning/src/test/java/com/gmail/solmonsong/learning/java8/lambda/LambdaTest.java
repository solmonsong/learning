package com.gmail.solmonsong.learning.java8.lambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.BiPredicate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gmail.solmonsong.learning.java8.lambda.Lambda;

public class LambdaTest {
	
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errStream = new ByteArrayOutputStream();
	
	@Before
	public void setup() {
		System.setOut(new PrintStream(outStream));
		System.setErr(new PrintStream(errStream));
	}
	
	@After
	public void cleanup() {
		System.setOut(null);
		System.setErr(null);
	}
	
	@Test
	public void testRunnable() {
		Lambda.getRunnablePrintlnHelloWorld().run();
		assertEquals(String.format("Hello World%n"), outStream.toString());
	}
	
	@Test
	public void testBiConsumer() {
		Lambda.getBiConsumerPrintlnStrConcat().accept("Hello", "World");
		assertEquals(String.format("HelloWorld%n"), outStream.toString());
	}
	
	@Test
	public void testBiFunction() {
		String result = Lambda.getBiFunctionStrConcat().apply("Hello", "World");
		assertEquals("HelloWorld", result);
	}
	
	@Test
	public void testBinaryOperatorIntSum() {
		int result = Lambda.getBinaryOperatorIntSum().apply(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testBinaryOperatorStrConcat() {
		String result = Lambda.getBinaryOperatorStrConcat().apply("Hello", "World");
		assertEquals("HelloWorld", result);
	}
	
	@Test
	public void testBiPredicate() {
		BiPredicate<String, String> biPredicate = Lambda.getBiPredicateCompareEquals();
		boolean resultTrue = biPredicate.test("Hello", "Hello");
		boolean resultFalse = biPredicate.test("Hello", "World");
		assertTrue(resultTrue);
		assertFalse(resultFalse);
	}
	
	@Test
	public void testBooleanSupplier() {
		boolean result = Lambda.getBooleanSupplierAlwaysTrue().getAsBoolean();
		assertTrue(result);
	}
	
	@Test
	public void testConsumer() {
		Lambda.getConsumerPrintlnArg().accept("Hello World");
	}
	
	@Test
	public void testDoubleBinaryOperator() {
		double result = Lambda.getDoubleBinaryOperatorSum().applyAsDouble(1.0, 2.1);
		assertEquals(3.1, result, 0.001);
	}
	
	@Test
	public void testDoubleConsumer() {
		Lambda.getDoubleConsumerPrintlnDouble().accept(1.0);
		assertEquals(1.0, Double.parseDouble(outStream.toString().trim()), 0.001);
	}
	
	@Test
	public void testMain() {
		Lambda.main(null);
		assertEquals(String.format("Run tests through JUnit%n"), outStream.toString());
	}
	
	/*
	 * For test coverage only.
	 */
	@Test
	public void testLambdaClass() {
		new Lambda();
	}
	
}
