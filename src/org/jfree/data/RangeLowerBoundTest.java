package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RangeLowerBoundTest {
	private Range negRange1;
	private Range posRange1;
	private Range zeroToPosRange;
	

	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		negRange1 = new Range(-5.0, -1.0);
		posRange1 = new Range(1.0, 5.0);
		zeroToPosRange = new Range(0.0, 6.0);
	}
	
	@Test
	public void getNegLowerBound() {
		double expected = -5.0;
		assertEquals(expected, negRange1.getLowerBound(), .000000001d);
		
	}
	
	@Test
	public void getPosLowerBound() {
		double expected = 1.0;
		assertEquals(expected, posRange1.getLowerBound(), .000000001d);
	}
	
	@Test
	public void getZeroLowerBound() {
		double expected = 0.0;
		assertEquals(expected, zeroToPosRange.getLowerBound(), .000000001d);
		
	}

	
	@After
	public void tearDown() throws Exception {
	}


}
