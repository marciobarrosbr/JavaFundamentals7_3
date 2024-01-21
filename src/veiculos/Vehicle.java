package veiculos;

public class Vehicle {
	//declaração de variáveis
	public static String  MAKE = "Augur";
	public static int numVehicles = 0;
	private String ChassisNo = "";
	private String model;
	
	//constructor
	public Vehicle() {
	}//end constructor
	
	//constructor
	public Vehicle(String model) {
		this.numVehicles +=1;
		this.ChassisNo +="ch"+numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");		
	}//end constructor
	
	//Classe aninhada que conterá os detalhes do motor
	public static class Engine extends Vehicle {
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			this.numVehicles +=1;
			this.setChassisNo("ch"+(Vehicle.numVehicles));
			this.setModel(model);
		}
		//método de retorno da variável final MAKE da classe Engine
		public static String getMake() {
			return MAKE;	
		}//end method getMake
		
		//método de retorno da váriavel final CAPACITY da classe Engine		
		public static int getCapacity() {
			return CAPACITY;
		}//end method getCPACITY
		
	}//end static class Engine
	
	//método estático que retorna uma String concatenada com a variável estática MAKE
	public static String showManufacturer() {		
		 return "Manufacturer Augur";
	}//end static method showManufacturer
	
	//método estático que retorna uma String contatenada dom a variável estática numcVehicle
	public static String showNumVehicle() {
		return "Number of vehicles manufactured: " + numVehicles;
	}
	
	//método set que atualiza a varivável ChassisNo
	public void setChassisNo(String chassis) {
		this.ChassisNo = chassis;
	}//end method setChassisNo
	
	//método get que apresenta a variável ChassisNo
	public String getChassisNo() {
		return ChassisNo;
	}//end method getChassisNo
	
	//método set que atualiza a variável model
	public void setModel(String model) {
		this.model = model;
	}//end method setModel
	
	//métod get que apresenta a variável model
	public String getModel() {
		return model;
	}//end method getModel
	
	public void setMake(String make) {
		MAKE = make;
	}
	public String toString() {
		return "The vehicle is manufactured by : "+MAKE
				+"\nModelo: "+ this.getModel()
				+"Chassis: "+ this.getChassisNo()
				+"\nThe engine make is "+Engine.getMake()
				+"\nTheengine capaciy is "+Engine.getCapacity()+"cc";
	}

	
}
