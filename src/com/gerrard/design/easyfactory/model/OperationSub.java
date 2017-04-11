package com.gerrard.design.easyfactory.model;

public class OperationSub extends Operation {

	OperationSub() {

	}

	@Override
	public double getResult(double... nums) {
		if (nums.length < 2) {
			throw new ArithmeticException("input array must be larger than two");
		}
		double difference = nums[0] * 2;
		for (double num : nums) {
			difference -= num;
		}
		return difference;
	}
}