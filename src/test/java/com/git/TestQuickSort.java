package com.git;

import com.git.sort.HillSort;
import com.git.sort.QuickSort;
import org.junit.Test;

/**
 * @Created by Administrator
 * @Date 2019/03/27 21:36
 */
public class TestQuickSort {
	@Test
	public void testQuickSort(){
		Integer[] integers = new Integer[]{1, 5, 7, 8, 11, 6, 3};
		QuickSort.getSort(integers,0,3);
		for (int i = 0; i < integers.length; i++) {
			if (i == integers.length - 1)
				System.out.print(integers[i] + "\n");
			else
				System.out.print(integers[i] + "\t");
		}
	}

	@Test
	public void testQuickSort02(){
		Double[] doubles = new Double[]{1.3, 1.8, 2.5, 6.9, 2.66, 3.88, 4.5, 11.2, -0.5};
		QuickSort.getSort(doubles,0,3);
		for (int i = 0; i < doubles.length; i++) {
			if (i == doubles.length - 1)
				System.out.print(doubles[i] + "\n");
			else
				System.out.print(doubles[i] + "  ");
		}
	}
}
