package com.Techment.oops;


	class Car{
		String name;
		int modelNo;
		Engine engine;
		public Car(String name, int modelNo, Engine engine) {
			super();
			this.name = name;
			this.modelNo = modelNo;
			this.engine = engine;
		}
		void displayCarInfo(){
			System.out.println("modelNo: "+modelNo);
			System.out.println("name: "+name);
			System.out.println("engineId: "+engine.engineId);
			System.out.println("engineType: "+engine.engineType);
			
		}
	}
	class Engine{
		int engineId;
		String engineType;
		public Engine(int engineId, String engineType) {
			super();
			this.engineId = engineId;
			this.engineType = engineType;
		}
	}
public class main2 {
	public static void main(String[] args){
		Engine engine=new Engine(1010,"2 Stock");
		Car car =new Car("benz", 101,engine);
		car.displayCarInfo();
	}

}
