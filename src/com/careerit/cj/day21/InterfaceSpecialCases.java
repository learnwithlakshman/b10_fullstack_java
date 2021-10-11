package com.careerit.cj.day21;


interface One{
	void m1();
	
}
interface Two{
	void m1();
	void m2();
}

interface Three extends One,Two{
	void m3();
}

class C1 implements Three{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceSpecialCases {

	
}
