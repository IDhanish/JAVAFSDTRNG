package com.ust.examples;
class Cars{
	private String carName;
	private String carType;
	public Cars(String name,String type)
	{
		this.carName=name;
		this.carType=type;
	}
	private String getCarName() {
		return this.carName;
	}
class Engine{
	String engineType;
	void setEngine() {
		if(Cars.this.carType.equals("4WD")) {
			if(Cars.this.getCarName().equals("crysler")) {
				this.engineType = "Smaller";}
			else {
				this.engineType = "Bigger";
			}
		}
		else {
			this.engineType="Bigger";
		}
	}
	String getEngineType()
	{
		return this.engineType;
	}
}}
public class Example53 {

	public static void main(String[] args) {
		Cars car1=new Cars("Mazda","8WD");
		Cars.Engine engine=car1.new Engine();
		engine.setEngine();
		System.out.println("Engine type for 8WD="+engine.getEngineType());

		Cars car2=new Cars("Crysler","4WD");
		Cars.Engine c2engine=car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine type for 4WD="+c2engine.getEngineType());
		
		Cars car3=new Cars("Mazda","4WD");
		Cars.Engine c3engine=car3.new Engine();
		c3engine.setEngine();
		System.out.println("Engine type for 8WD="+c3engine.getEngineType());
	}

}
