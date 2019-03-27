package com.git.sort;

/**
 * @Created by Administrator
 * @Date 2019/03/27 21:07
 */
public class HeapSort {
	/**
	 * >>堆排序
	 * 对简单选择排序的优化。
	 * 将序列构建成大顶堆。
	 * 将根节点与最后一个节点交换，然后断开最后一个节点。
	 * 重复第一、二步，直到所有节点断开
	 * @param t 数组
	 * @param <T> 类型
	 */
	public static <T extends Comparable<T>> void getSort(T[] t) {
		if (t != null && t.length > 0) {//实现从大到小排序
			int len = t.length;
			// 循环建堆
			for (int i = 0; i < len - 1; i++) {
				//建堆
				buildMaxHeap(t, len - 1 - i);
				//交换堆顶和最后一个元素
				swap(t, 0, len - 1 - i);
			}
		}
	}

	// 交换方法
	private static <T extends Comparable<T>> void swap(T[] data, int i, int j) {
		T temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	// 对data数组从0到lastIndex建大顶堆
	private static <T extends Comparable<T>> void buildMaxHeap(T[] data, int lastIndex) {
		//从lastIndex处节点（最后一个节点）的父节点开始
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			//k保存正在判断的节点
			int k = i;
			//如果当前k节点的子节点存在
			while (k * 2 + 1 <= lastIndex) {
				//k节点的左子节点的索引
				int biggerIndex = 2 * k + 1;
				//如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
				if (biggerIndex < lastIndex) {
					//若果右子节点的值较大
					if (data[biggerIndex].compareTo(data[biggerIndex + 1]) > 0) {
						//biggerIndex总是记录较大子节点的索引
						biggerIndex++;
					}
				}
				//如果k节点的值小于其较大的子节点的值
				if (data[k].compareTo(data[biggerIndex]) > 0) {
					//交换他们
					swap(data, k, biggerIndex);
					//将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
					k = biggerIndex;
				} else {
					break;
				}
			}
		}
	}
}
