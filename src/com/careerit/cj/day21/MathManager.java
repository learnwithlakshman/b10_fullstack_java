package com.careerit.cj.day21;

interface MathFunction {

	public boolean isPrime(int num);

	public int primeCount(int lb, int ub);

	default int[] generatePrime(int lb, int ub) {
		// Logic
		return null;
	}

}

class MathFunctionImpl implements MathFunction {

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int primeCount(int lb, int ub) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int[] generatePrime(int lb, int ub) {
		// TODO Auto-generated method stub
		return MathFunction.super.generatePrime(lb, ub);
	}

}

public class MathManager {

	public static void main(String[] args) {
		MathFunction fun = new MathFunctionImpl();
		boolean flag = fun.isPrime(10);
		int count = fun.primeCount(10, 100);
		System.out.println(flag);
		System.out.println(count);
	}
}
