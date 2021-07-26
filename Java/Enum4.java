package com.ust.examples;
enum Directions1{
	EAST,WEST,NORTH,SOUTH
}
public class Enum4 {
	Directions1 dir;
public Enum4(Directions1 dir) {
	this.dir=dir;
}
public void getMyDirection() {
	switch(dir) {
	case EAST:
		System.out.println("In East Direction");
		break;
	case WEST:
		System.out.println("In West Direction");
		break;
	case NORTH:
		System.out.println("In North Direction");
		break;
	case SOUTH:
		System.out.println("In South Direction");
		break;
	default:
		System.out.println("In South Direction");
		break;
	}
}
	public static void main(String[] args) {
		Enum4 obj1=new Enum4(Directions1.EAST);
		obj1.getMyDirection();
		Enum4 obj2=new Enum4(Directions1.SOUTH);
		obj2.getMyDirection();

	}

}
