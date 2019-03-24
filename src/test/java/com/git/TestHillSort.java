package com.git;

import com.git.sort.HillSort;
import org.junit.Test;

/**
 * @Created by Administrator
 * @Date 2019/03/24 23:01
 */
public class TestHillSort {
	@Test
	public void testHillSort(){
		Integer[] integers = new Integer[]{1, 5, 7, 8, 11, 6, 3};
		HillSort.getSort(integers);
		for (int i = 0; i < integers.length; i++) {
			if (i == integers.length - 1)
				System.out.print(integers[i] + "\n");
			else
				System.out.print(integers[i] + "\t");
		}
	}
}
