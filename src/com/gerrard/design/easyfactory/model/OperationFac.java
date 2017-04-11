package com.gerrard.design.easyfactory.model;

public class OperationFac extends Operation {

	@Override
	public double getResult(double... nums) {
		if (nums.length != 1) {
			throw new ArithmeticException("only support one input");
		}
		if (nums[0] < 0) {
			throw new ArithmeticException("only positive number and zero have factorial property");
		}
		int num = (int) nums[0];
		return factorial(num);
	}

	private int factorial(int num) {
		if (num < 2) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}