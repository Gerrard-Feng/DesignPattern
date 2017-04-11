package com.gerrard.design.easyfactory.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.gerrard.design.easyfactory.model.OperationAdd;
import com.gerrard.design.easyfactory.model.OperationDiv;
import com.gerrard.design.easyfactory.model.OperationFac;
import com.gerrard.design.easyfactory.model.OperationMul;
import com.gerrard.design.easyfactory.model.OperationPow;
import com.gerrard.design.easyfactory.model.OperationSub;

public final class OperationMap {

	public static Map<String, Class<?>> operMap;

	static {
		operMap = new HashMap<>();
		operMap.put("+", OperationAdd.class);
		operMap.put("-", OperationSub.class);
		operMap.put("*", OperationMul.class);
		operMap.put("/", OperationDiv.class);
		operMap.put("^", OperationPow.class);
		operMap.put("!", OperationFac.class);
		// this map is not allowed to modify
		operMap = Collections.unmodifiableMap(operMap);
	}

	private OperationMap() {

	}
}