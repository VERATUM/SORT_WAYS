package com.git.sort;

public class Compare {
	/**
	 * 获取传入数组的最大与最小值
	 *
	 * @param num
	 * @param <T>
	 * @return
	 */
	public <T extends Comparable<T>> Num<T> getMaxAndMin(T[] num) {
		T max = num[0];
		T min = num[0];

		// 遍历数据，获取最大值与最小值
		for (int i = 0; i < num.length; i++) {
			if (max.compareTo(num[i]) < 0)
				max = num[i];
			if (min.compareTo(num[i]) > 0)
				min = num[i];
		}
		return new Num<T>(min, max);
	}
}
