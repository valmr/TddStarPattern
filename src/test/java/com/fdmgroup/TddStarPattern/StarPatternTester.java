package com.fdmgroup.TddStarPattern;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StarPatternTester {

	private StarPattern starPattern;
	
	@Before
	public void init(){
		starPattern = new StarPattern();
	}
	
	@Test
	public void testStarPatternMakeTriangleWithHeightOneReturnsCorrectPattern(){
		String expectedPattern = "*";
		assertEquals(expectedPattern, starPattern.makeTrianglePattern(1));
	}
	
	@Test
	public void testStarPatternMakeTriangleWithHeightTwoReturnsCorrectPattern(){
		String expectedPattern = " *\n***";
		assertEquals(expectedPattern, starPattern.makeTrianglePattern(2));
	}
	
	@Test
	public void testStarPatternMakeTriangleWithHeightThreeReturnsCorrectPattern(){
		String expectedPattern = "  *\n ***\n*****";
		assertEquals(expectedPattern, starPattern.makeTrianglePattern(3));
	}
	
	@Test
	public void testStarPatternMakeTriangleWithHeightFiveReturnsCorrectPattern(){
		String expectedPattern = "    *\n   ***\n  *****\n *******\n*********";
		assertEquals(expectedPattern, starPattern.makeTrianglePattern(5));
	}
	
	@Test
	public void testStarPatternMakeDiamondWithHeightOneReturnsCorrectDiamondPattern(){
		String expectedPattern = "*";
		assertEquals(expectedPattern, starPattern.makeDiamondPattern(1));
	}
	
	@Test
	public void testStarPatternMakeDiamondWithHeightThreeReturnsCorrectDiamondPattern(){
		String expectedPattern = " *\n***\n *";
		assertEquals(expectedPattern, starPattern.makeDiamondPattern(3));
	}
	
	@Test
	public void testStarPatternMakeDiamondWithHeightFiveReturnsCorrectDiamondPattern(){
		String expectedPattern = "  *\n ***\n*****\n ***\n  *";
		assertEquals(expectedPattern, starPattern.makeDiamondPattern(5));
	}
	
	@Test
	public void testStarPatternMakeNumberPatternWithHeightOneReturnsCorrectNumberPattern(){
		String expectedPattern = "0";
		assertEquals(expectedPattern, starPattern.makeNumberPattern(1));
	}
	
	@Test
	public void testStarPatternMakeNumberPatternWithHeightThreeReturnsCorrectNumberPattern(){
		String expectedPattern = "  0\n 012\n01234";
		assertEquals(expectedPattern, starPattern.makeNumberPattern(3));
	}
	
	@Test
	public void testStarPatternMakeNumberPatternWithHeightFourReturnsCorrectNumberPattern(){
		String expectedPattern = "   0\n  012\n 01234\n0123456";
		assertEquals(expectedPattern, starPattern.makeNumberPattern(4));
	}	
}
