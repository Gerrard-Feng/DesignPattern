package com.gerrard.design.factorymethod.model;

public class OperationSubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

	private class OperationSub extends Operation {

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
}