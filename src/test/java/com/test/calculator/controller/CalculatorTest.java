package com.test.calculator.controller;
import com.test.calculate.controller.AdditionController;

import org.junit.Assert; 
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private AdditionController objCalcUnderTest;

	@Before
	public void setUp() {
	//Arrange
	objCalcUnderTest = new AdditionController();
	}

	@Test
	public void testAdd() { 
	int a = 15; int b = 20; 
	int expectedResult = 35;
	//Act 
	long result = objCalcUnderTest.add(a, b);
	//Assert
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testSubtract() {
	int a = 25; int b = 20; 
	int expectedResult = 5; 
	long result = objCalcUnderTest.subtract(a, b);
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMultiply() {
	int a = 10; int b = 25;
	long expectedResult = 250;
	long result = objCalcUnderTest.multiply(a, b);
	Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() {
	double a = 56.0; double b = 10.0; 
	double expectedResult = 5.6; 
	double result = objCalcUnderTest.divide(a, b);
	Assert.assertEquals(expectedResult, result,0.00005); 
	}

	
	} 	


