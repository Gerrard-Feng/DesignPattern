package com.gerrard.design.easyfactory.model;

public class OperationAdd extends Operation {

	// the constructor should only be called by factory method
	OperationAdd() {

	}

	@Override
	public double getResult(double... nums) {
		double sum = 0;
		for (double num : nums) {
			sum += num;
		}
		return sum;
	}
}