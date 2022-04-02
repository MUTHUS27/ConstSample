package org.demo;

public class C1 extends C2{

	public C1() {
		this("2022");
		
		System.out.println("m1");
		
	}
		public C1(String yr) {
		super(12);
		
		System.out.println("m2");
	}
			public static void main(String[] args) {
		
		C1 c= new C1();
	}
}
