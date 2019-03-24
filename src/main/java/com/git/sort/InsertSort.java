package com.git.sort;

/**
 * @Created by Ver
 * @Date 2019/03/24 16:57
 * >> 插入排序
 * 直接插入排序（Straight Insertion Sorting）的基本思想：
 * 在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排好顺序的，
 * 现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的。
 * 如此反复循环，直到全部排好顺序。
 */
public class InsertSort {
	/**
	 * 代码实现：
	 * 首先设定插入次数，即循环次数，for(int i=1;i<length;i++)，1个数的那次不用插入。
	 * 设定插入数和得到已经排好序列的最后一个数的位数。insertNum和j=i-1。
	 * 从最后一个数开始向前循环，如果插入数小于当前数，就将当前数向后移动一位。
	 * 将当前数放置到空着的位置，即j+1。
	 *
	 * @param t T[]数组
	 */
	public static <T extends Comparable<T>> T[] getSort(T[] t) {
		if (t != null && t.length > 0) {
			// 排序数组长度
			int len = t.length;
			// 插入的数
			T insertNum;
			for (int i = 1; i < len; i++) {// 第一次不用插入，从第二位开始
				insertNum = t[i];
				int j = i - 1; // 序列元素的个数
				while(j >= 0 && t[j].compareTo(insertNum) < 0) {//从后往前循环，将大于insertNum的数向后移动
					// 从大到小排序
					t[j + 1] = t[j];//元素向后移动
					j--;
				}
				t[j + 1] = insertNum;//找到位置，插入当前元素
			}
		}
		return t;
	}
}
