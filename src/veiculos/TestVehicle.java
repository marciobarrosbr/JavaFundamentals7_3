package veiculos;

import veiculos.Vehicle.Engine;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Vehicle.showManufacturer());
		System.out.println(Vehicle.showNumVehicle());
		Vehicle vehicle1 = new Vehicle("Vision"+"\n");
		System.out.println(vehicle1.toString()+"\n");
		
		Vehicle vehicle2 = new Vehicle("Edict"+"\n");		
		System.out.println(vehicle2.toString()+"\n");
		
		vehicle2.setMake("Seer");
				
		System.out.println(vehicle1.toString()+"\n");
		
		System.out.println(vehicle2.toString()+"\n");
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		
		System.out.println("Vehicle number "+vehicle3.getChassisNo()+" is a "+ vehicle3.getModel()+ " model  and has an engine of "+Vehicle.Engine.getCapacity()+"cc");
		System.out.println(Vehicle.showNumVehicle());
		
	}

}
