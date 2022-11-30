//Source file: D:\\working\\CourseCaseStudies\\designPatternsNew\\patterns\\org\\itservicesone\\patterns\\strategy\\sort\\CustomerDetailsApp.java

package com.mlsc.trainings.designpatterns.a3.behavioral.strategy;

public class CustomerDetailsApp {
	private CustomerList theCustomerList;

	/**
	 * @roseuid 45D5941F00FA
	 */
	public CustomerDetailsApp() {

	}

	public static void main(String args[]) {

		CustomerList list = new CustomerList();
		list.performSort();

		System.out.println("------ Changing Behavior Now ----------");
		list.setSortStrategy(new MergeSort());
		list.performSort();

	}
}
