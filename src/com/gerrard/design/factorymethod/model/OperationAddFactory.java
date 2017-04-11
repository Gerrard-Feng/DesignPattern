package com.gerrard.design.factorymethod.model;

public class OperationAddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

	/*
	 * because the relation between factory and operation is 
	 * one-to-one, so the constructor of operation class should only 
	 * be exposed to its factory.
	 * inner class structure is the proper one.
	 */
	private class OperationAdd extends Operation {

		@Override
		public double getResult(double... nums) {
			double sum = 0;
			for (double num : nums) {
				sum += num;
			}
			return sum;
		}
	}
}