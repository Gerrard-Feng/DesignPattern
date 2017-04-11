package com.gerrard.design.easyfactory.model;

public class OperationPow extends Operation {

	OperationPow() {

	}

	@Override
	public double getResult(double... nums) {
		if (nums.length != 2) {
			throw new ArithmeticException("only support two input");
		}
		return Math.pow(nums[0], nums[1]);
	}
}