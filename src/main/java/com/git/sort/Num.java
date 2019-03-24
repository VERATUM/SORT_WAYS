package com.git.sort;

/**
 * Num 泛型类
 * @param <T> 泛型
 */
public class Num<T> {
	// 定义最大、最小值
	private T min;
	private T max;

	// 构造函数
	public Num() {}

	public Num(T min, T max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public String toString() {
		return "Num{" +
				"min=" + min +
				", max=" + max +
				'}';
	}

	public T getMin() {
		return min;
	}

	public void setMin(T min) {
		this.min = min;
	}

	public T getMax() {
		return max;
	}

	public void setMax(T max) {
		this.max = max;
	}
}
