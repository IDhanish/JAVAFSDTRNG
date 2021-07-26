package com.ust.examples;

public class Example59 {
private void getValue() {
	int sum=20;
	class Inner2{
		public int divisor;
		public int remainder;
		public Inner2() {
			divisor=4;
			remainder=sum%divisor;
		}
		private int getDivisor()
		{
			return divisor;
		}
		private int getRemainder() {
			return sum%divisor;
		}
		private int getQuotient() {
			System.out.println("Inside inner class");
			return sum/divisor;
		}
	}
	Inner2 inner=new Inner2();
	System.out.println("Divisor="+inner.getDivisor());
	System.out.println("Remainder="+inner.getRemainder());
	System.out.println("Quotient="+inner.getQuotient());
}
	public static void main(String[] args) {
		Example59 outer=new Example59();
		outer.getValue();

	}

}
