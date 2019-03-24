package com.git.sort;

/**
 * @Created by Ver
 * @Date 2019/03/24 22:53
 * >> 希尔排序
 * 针对直接插入排序的效率问题，有人对次进行了改进与升级，这就是现在的希尔排序。
 * 希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。希尔排序是非稳定排序算法。
 * ---
 * 希尔排序是基于插入排序的以下两点性质而提出改进方法的：
 * ---
 * 插入排序在对几乎已经排好序的数据操作时， 效率高， 即可以达到线性排序的效率
 * 但插入排序一般来说是低效的， 因为插入排序每次只能将数据移动一位
 * ---
 * 对于直接插入排序问题，数据量巨大时。
 * -
 * 将数的个数设为n，取奇数k=n/2，将下标差值为k的数分为一组，构成有序序列。
 * -
 * 再取k=k/2 ，将下标差值为k的书分为一组，构成有序序列。
 * -
 * 重复第二步，直到k=1执行简单插入排序。
 * -
 */
public class HillSort {
	/**
	 * 代码实现：
	 * 首先确定分的组数。
	 * 然后对组中元素进行插入排序。
	 * 然后将length/2，重复1,2步，直到length=0为止。
	 */
	public static <T extends Comparable<T>> T[] getSort(T[] t) {
		if (t != null && t.length > 0) {
			int len = t.length; // 获取数组长度
			while (len != 0){
				len = len / 2;
				for (int i = 0; i < len; i++) { // 分组
					for (int j = i + len; j < t.length; j += len){
						// 元素从第二哥开始
						int k = j - len; // k为有序序列最后一位的位数
						T temp = t[j]; // 要插入的元素
						while(k >= 0 && temp.compareTo(t[k]) > 0){// 从大到小排序
							// 从后往前遍历
							t[k + len] = t[k];
							k -= len; //往后移动len位
						}
						t[k + len] = temp;
					}
				}
			}
		}
		return t;
	}
}
