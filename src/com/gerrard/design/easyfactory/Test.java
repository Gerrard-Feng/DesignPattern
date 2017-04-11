package com.gerrard.design.easyfactory;

import com.gerrard.design.easyfactory.model.Operation;
import com.gerrard.design.easyfactory.model.OperationAdd;
import com.gerrard.design.easyfactory.model.OperationFactory1;
import com.gerrard.design.easyfactory.model.OperationFactory2;

public class Test {

	public static void main(String[] args) {

		Operation oper1 = OperationFactory1.createOperate("!");
		double result1 = oper1.getResult(1111);
		System.out.println(result1);

		Operation oper2 = OperationFactory2.createOperate(OperationAdd.class);
		double[] nums2 = { 2, 3, 4 };
		double result2 = oper2.getResult(nums2);
		System.out.println(result2);

		Operation oper3 = OperationFactory2.createOperate("!");
		double result3 = oper3.getResult(8);
		System.out.println(result3);
	}
}