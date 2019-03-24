package com.git;

import com.git.sort.BubbleSort;
import org.junit.Test;

public class TestBubbleSort {
	BubbleSort bubbleSort = new BubbleSort();
	@Test
	public void testBubbleSortInteger(){
		Integer[] integers = new Integer[]{1, 5, 7, 8, 11, 6, 3};
		bubbleSort.getSort(integers);
		for (int i = 0; i < integers.length; i++) {
			if (i == integers.length - 1)
				System.out.print(integers[i] + "\n");
			else
				System.out.print(integers[i] + "\t");

		}
	}

	@Test
	public void testBubbleSortDouble(){
		Double[] doubles = new Double[]{1.3, 1.8, 2.5, 6.9, 2.66, 3.88, 4.5, 11.2, -0.5};
		bubbleSort.getSort(doubles);
		for (int i = 0; i < doubles.length; i++) {
			if (i == doubles.length - 1)
				System.out.print(doubles[i] + "\n");
			else
				System.out.print(doubles[i] + ",");
		}
	}

	@Test
	public void testBubbleSortString(){
		String[] strings = new String[]{"abc", "test", "atum", "ver", "tt"};
		bubbleSort.getSort(strings);
		for (int i = 0; i < strings.length; i++) {
			if (i == strings.length - 1)
				System.out.print(strings[i] + "\n");
			else
				System.out.print(strings[i] + ",");
		}
	}
}
