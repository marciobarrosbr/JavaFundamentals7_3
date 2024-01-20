package staticTurtleExemple;

public class Turtle {
	public static String food = "Turle Feed";
	public int age;
	public int tankNum;
	public static int numTanks = 3;
	
	public Turtle(int age) {
		this.age = age;
		tankNum = (int)((Math.random() * numTanks)+1);
	}//end constructor
	
	public void swim() {//implementation
	}
	public int getAge() {
		return age;
	}
	
	public int getTankOfResidence() {
		return tankNum;
	}
	
	public static String fishTank() {
		return "I have " + numTanks + "fish tanks";
	}//end static method fishTank
}
