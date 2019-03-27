package com.git.sort;

/**
 * @Created by Administrator
 * @Date 2019/03/27 21:28
 */
public class QuickSort {
	/**
	 * >>快速排序
	 * 要求时间最快时。
	 * 选择第一个数为p，小于p的数放在左边，大于p的数放在右边。
	 * 递归的将p左边和右边的数都按照第一步进行，直到不能递归
	 */
	public static <T extends Comparable<T>> void getSort(T[] t, int start, int end){
		if (t != null && t.length > 0) {
			if (start < end){
				T baseNum = t[start];
				T midNum;
				int i = start;
				int j = end;
				do {
					while(t[i].compareTo(baseNum) > 0 && i < end)
						i++;
					while(t[j].compareTo(baseNum) < 0 && j > start)
						j--;
					if (i <= j){
						midNum = t[i];
						t[i] = t[j];
						t[j] = midNum;
						i++;
						j--;
					}
				} while (i <= j);
				if (start < j)
					getSort(t, start, j);
				if (end > i)
					getSort(t, i, end);
			}
		}
	}
}
