package org.demo;

public abstract class EA2 implements I1,I2  {

	
//	public EA2() {
//		System.out.println("m6");
//	}
	
	public abstract void ea22();
	
	@Override
		public void inter1() {
			System.out.println("m7");
			this.inter2();
		}
	
	@Override
		public void inter2() {
			System.out.println("m8");
			
		}
}
