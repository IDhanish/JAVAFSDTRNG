package com.ust.examples;
class CPU{
	double price;
class Processor{
	double core;
	String manufacturer;
	double getCache() {
		return 4.3;
	}
}
protected class Ram{
	double memory;
	String manufacturer;
	double getClockSpeed() {
		return 5.5;
	}
}}
public class Example52 {

	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.Processor p1=cpu.new Processor();
		CPU.Ram r1=cpu.new Ram();
		System.out.println("Processor cache="+p1.getCache());
		System.out.println("RAM clockspeed="+r1.getClockSpeed());
	}

}
