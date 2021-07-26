package com.ust.examples;
class Example37 {
	private String formatNumber(int value) {
		return String.format("%d",value);
	}
	private String formatNumber(double value) {
		return String.format("%.3f",value);
	}
	private String formatNumber(String value) {
		return String.format("%2f",Double.parseDouble(value));
	}

	public static void main(String[] args) {
		Example37 e=new Example37();
		System.out.println(e.formatNumber(500));
		System.out.println(e.formatNumber(89.9934));
		System.out.println(e.formatNumber(550));
	}

}
