package com.project;

import java.util.logging.Logger;

public class A extends CalcAbs{
	 static Logger logger = Logger.getLogger(A.class.getName());
	 
	@Override
	void sum(int a, int b) {
		logger.info("Sum "+(a+b));
		
	}

	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	

}
