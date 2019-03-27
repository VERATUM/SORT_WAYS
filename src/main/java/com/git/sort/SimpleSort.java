package com.git.sort;

/**
 * @Created by Administrator
 * @Date 2019/03/27 20:53
 * >> 简单排序
 * 常用于取序列中最大最小的几个数时。
 * (如果每次比较都交换，那么就是交换排序；如果每次比较完一个循环再交换，就是简单选择排序。)
 * 遍历整个序列，将最小的数放在最前面。
 * 遍历剩下的序列，将最小的数放在最前面。
 * 重复第二步，直到只剩下一个数。
 */
public class SimpleSort {
	/**
	 * 代码实现：
	 * 首先确定循环次数，并且记住当前数字和当前位置。
	 * 将当前位置后面所有的数与当前数字进行对比，小数赋值给key，并记住小数的位置。
	 * 比对完成后，将最小的值与第一个数的值交换。
	 * 重复2、3步。
	 * @param t 排序数组
	 * @param <T> 类型
	 * @return 返回结果
	 */
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
