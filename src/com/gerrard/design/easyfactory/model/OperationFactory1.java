package com.gerrard.design.easyfactory.model;

import com.gerrard.design.easyfactory.constants.OperationConstants;

public class OperationFactory1 {

	public static Operation createOperate(String operator) {
		Operation oper = null;
		switch (operator) {
		case OperationConstants.OPERATION_ADD:
			oper = new OperationAdd();
			break;
		case OperationConstants.OPERATION_SUB:
			oper = new OperationSub();
			break;
		case OperationConstants.OPERATION_MUL:
			oper = new OperationMul();
			break;
		case OperationConstants.OPERATION_DIV:
			oper = new OperationDiv();
			break;
		case OperationConstants.OPERATION_POW:
			oper = new OperationPow();
			break;
		case OperationConstants.OPERATION_FAC:
			oper = new OperationFac();
			break;
		default:
			throw new ArithmeticException("operator [" + operator + "] is not supported");
		}
		return oper;
	}
}