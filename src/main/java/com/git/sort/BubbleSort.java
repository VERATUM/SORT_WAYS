package com.git.sort;

/**
 * 冒泡排序
 * 简单的排序
 */
public class BubbleSort {
	/**
	 * 可以对任意类型的数组，进行冒泡排序
	 * @param t 传入的泛型数组
	 * @param <T> 类型
	 * @return 返回排序后的数组
	 */
	public <T extends Comparable<T>> T[] getSort(T[] t) {
		if (t != null && t.length > 0) {
			for (int i = 0; i < t.length - 1; i++) {
				for (int j = i; j < t.length; j++) {
					// 实现从大到小的排序
					if (t[j].compareTo(t[i]) > 0) {
						T temp = t[i];
						t[i] = t[j];
						t[j] = temp;
					}
				}
			}
		}
		return t;
	}
}
