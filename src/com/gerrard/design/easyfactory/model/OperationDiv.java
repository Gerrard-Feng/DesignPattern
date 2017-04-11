package com.gerrard.design.easyfactory.model;

public class OperationDiv extends Operation {

	OperationDiv() {

	}

	@Override
	public double getResult(double... nums) {
		if (nums.length != 2) {
			throw new ArithmeticException("only support two input");
		}
		if (nums[1] == 0) {
			throw new ArithmeticException("the dividend is zero");
		}
		return nums[0] / nums[1];
	}
}