package com.ust.examples;
enum Directions{
	EAST,WEST,NORTH,SOUTH
}
public class Enum3 {

	public static void main(String[] args) {
		Directions dir=Directions.NORTH;
		if(dir==Directions.EAST) {
			System.out.println("Direction:East");
		}else if(dir==Directions.WEST) {
			System.out.println("Direction:North");
		}else {
			System.out.println("Direction:South");
		}

	}

}

