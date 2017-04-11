package com.gerrard.design.factorymethod;

import com.gerrard.design.factorymethod.model.IFactory;
import com.gerrard.design.factorymethod.model.Operation;
import com.gerrard.design.factorymethod.model.OperationAddFactory;

public class Test {

	/*
	 * The advantage of factory method is the clients decide to 
	 * create what they want rather than the factory does in easy 
	 * factory pattern. It conforms to open-close principle.
	 * However, the disadvantage is that one factory only creates one 
	 * product. It means when the number of products is large, the internal 
	 * storage we need will be doubled. 
	 * The classes we need to maintain is also doubled.
	 * 
	 */
	public static void main(String[] args) {

		IFactory factory = new OperationAddFactory();
		Operation oper = factory.createOperation();
		double[] nums = new double[] { 2, 3 };
		System.out.println(oper.getResult(nums));
	}
}