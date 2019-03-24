package com.git;

import com.git.sort.Compare;
import org.junit.Test;

public class TestCompare {
	Compare compare = new Compare();

	@Test
	public void testCompareInteger() {
		Integer[] integers = new Integer[]{1, 5, 7, 8, 11, 6, 3};
		System.out.println("compare = " + compare.getMaxAndMin(integers));
	}

	@Test
	public void testCompareDouble() {
		Double[] doubles = new Double[]{1.3, 1.8, 2.5, 6.9, 2.66, 3.88, 4.5, 11.2, -0.5};
		System.out.println("compare = " + compare.getMaxAndMin(doubles));
	}

	@Test
	public void testCompareString() {
		String[] strings = new String[]{"abc", "test", "atum", "ver", "tt"};
		System.out.println("compare = " + compare.getMaxAndMin(strings));
	}

}
