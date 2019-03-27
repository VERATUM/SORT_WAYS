package com.git.sort;

/**
 * @Created by Administrator
 * @Date 2019/03/27 20:53
 */
public class SimpleSort {
	public static <T extends Comparable<T>> T[] getSort(T[] t) {
		if (t != null && t.length > 0) {
			int len = t.length;
			for (int i = 0; i < len; i++) {
				T value = t[i];
				int position = i;
				for (int j = i + 1; j < len; j++) {
					if (t[j].compareTo(value) > 0) {//找到最大的值和位置
						value = t[j];
						position = j;
					}
				}
				t[position] = t[i];
				t[i] = value;
			}
		}
		return t;
	}
}
