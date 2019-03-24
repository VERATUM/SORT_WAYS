package com.git.sort;

/**
 * 冒泡排序
 * @author ver
 *
 * 很简单，用到的很少，据了解，面试的时候问的比较多！
 * 将序列中所有元素两两比较，将最大的放在最后面。
 * 将剩余序列中所有元素两两比较，将最大的放在最后面。
 * 重复第二步，直到只剩下一个数
 *
 * 代码实现：
 * 设置循环次数。
 * 设置开始比较的位数，和结束的位数。
 * 两两比较，将最小的放到前面去。
 * 重复2、3步，直到循环次数完毕。
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
