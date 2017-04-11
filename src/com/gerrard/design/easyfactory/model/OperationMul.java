package com.gerrard.design.easyfactory.model;

public class OperationMul extends Operation {

	OperationMul() {

	}

	@Override
	public double getResult(double... nums) {
		double product = 1;
		for (double num : nums) {
			product *= num;
		}
		return product;
	}
}