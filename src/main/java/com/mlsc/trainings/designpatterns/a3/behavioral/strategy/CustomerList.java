//Source file: D:\\working\\CourseCaseStudies\\designPatternsNew\\patterns\\org\\itservicesone\\patterns\\strategy\\sort\\CustomerList.java

package com.mlsc.trainings.designpatterns.a3.behavioral.strategy;

public class CustomerList {
	private SortStrategy sortStrategy;

	/**
	 * @roseuid 45D5941F0138
	 */
	public CustomerList() {
		this.sortStrategy = new QuickSort();

	}

	/**
	 * @roseuid 45D593C300EA
	 */
	public void performSort() {
		sortStrategy.sort();
	}

	public void setSortStrategy(SortStrategy sortStrategy) {

		this.sortStrategy = sortStrategy;

	}
}
