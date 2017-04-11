package com.gerrard.design.easyfactory.model;

import com.gerrard.design.easyfactory.constants.OperationMap;

// use reflection
public class OperationFactory2 {

	public static Operation createOperate(Class<?> clazz) {
		Operation oper = null;
		try {
			/*
			 *  to prove invoke newInstance() method successfully, the Operation class
			 *  is assumed to have a constructor with empty input and this OperationFactory
			 *  class must have authority to the construction method of Operation.
			 */
			oper = (Operation) clazz.newInstance();
		} catch (Exception e) {
			throw new ArithmeticException(clazz.getName() + " is not a operation realization class");
		}
		return oper;
	}
	
	public static Operation createOperate(String operator) {
		Class<?> clazz = OperationMap.operMap.get(operator);
		if (clazz == null) {
			throw new ArithmeticException("operator [" + operator + "] is not supported");
		}
		try {
			return (Operation) clazz.newInstance();
		} catch (Exception e) {
			throw new ArithmeticException("operator [" + operator + "] is not supported");
		}
	}
}