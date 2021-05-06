package com.cg;

import javax.management.RuntimeErrorException;

class MyException extends Exception
{
	
}
public class Example1 {

	public void example()
	{
		try {
			myExample();
		}
		finally {
			try {
				yourExmple();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	private void myExample() throws MyException {
		// TODO Auto-generated method stub
		throw new Exception();
		
	}

	private void yourExmple() throws RuntimeException {
		// TODO Auto-generated method stub
		throw new RuntimeException();
		
	}

}
