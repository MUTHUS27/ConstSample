package org.demo;

public class C2  extends EA1{

	public C2(int a) {
		this();
		System.out.println("m3");
		
	}
	
	public C2() {
		System.out.println("m4");
		this.ea11();
		
	}

	@Override
	public void ea11() {
		System.out.println("m5");
	this.ea22();
		
	}

	@Override
	public void ea22() {
		System.out.println("m6");
		super.ea33();
	}
	
}
