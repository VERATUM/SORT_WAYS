package com.git;

import com.git.sort.Compare;
import com.git.sort.InsertSort;
import com.git.sort.Num;
import org.junit.Test;

/**
 * @Created by Administrator
 * @Date 2019/03/24 17:08
 */
public class TestInsertSort {
	private Compare compare = new Compare();
	@Test
	public void testInsertSort(){
		Integer[] integers = new Integer[]{1, 5, 7, 8, 11, 6, 3};
		InsertSort.getSort(integers);
		for (int i = 0; i < integers.length; i++) {
			if (i == integers.length - 1)
				System.out.print(integers[i] + "\n");
			else
				System.out.print(integers[i] + "\t");
		}

		Num<Integer> maxAndMin = compare.getMaxAndMin(integers);
		System.out.println("maxAndMin = " + maxAndMin);
	}
}
