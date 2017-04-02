package com.triangle.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.triangle.MaxTotal;

public class MaxTotalTest {

	MaxTotal maxTotal;
	ArrayList<ArrayList<Integer>> matrixtest;

	@Before
	public void init() {
		maxTotal = new MaxTotal();
		matrixtest = new ArrayList<>();
	}

	@Test
	public void testNullCheck() {
		matrixtest = null;
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 0, result);
	}
	
	@Test
	public void testEmptyCheck() {
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 0, result);
	}

	@Test
	public void test0() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(0)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 0, result);
	}


	@Test
	public void test1() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 1, result);
	}

	@Test
	public void test2() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(0)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,0)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 1, result);
	}

	@Test
	public void test3() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(0)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,2)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(0,0,0)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 2, result);
	}

	@Test
	public void test4() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,0)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(0,0,9)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 10, result);
	}

	@Test
	public void test5() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(3)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(7,4)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(2,4,6)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(8,5,9,3)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 23, result);
	}

	@Test
	public void test6() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(9)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(-2,2)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(5,3,7)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(2,3,2,1)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 20, result);
	}

	@Test
	public void test7() {
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,2)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
		matrixtest.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6)));
		int result = maxTotal.calculateMax(matrixtest);
		assertEquals("Incorrect value calculated", 21, result);
	}

}
