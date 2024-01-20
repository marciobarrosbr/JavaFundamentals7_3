package staticSpaceExample;

public class Space {
	
	// Classe aninhada static Point
	public static class Points{
		private double x, y, z;
		
		public Points(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}//end constructor Point
		
		//metodo estatico exclusivo para acessar a classe estatica Points e seu construtor
		public static Points creatPoint(double x, double y, double z) {
			return new Points(x,y,x);
		}
		
		public void display() {
			System.out.println("Point: (" + x + "," + y + "," + "," + z + ")");
		}//end method display
		
	}//end static class Point
	
	//clase aninhada estática Line
	public static class Line{
		private Points startPoint, endPoint;//a classe Line possui duas instancias da classe Point como variáveis privadas
		
		public Line(Points startPoint, Points endPoint) {
			this.startPoint = startPoint;
			this.endPoint = endPoint;
		}//end constructor Line
		
		//metodo estatico exclusivo para acessar a classe estatica Line e seu construtor
		public static Line createLine(Points a, Points b) {
			
			return new Line(a, b);
		}//end metodo estatitico Line para acerros exclusivo a classe Line e seu construtor
		
		public void display() {
			System.out.println("Line From: ");
			startPoint.display();
			System.out.println("to:");
			endPoint.display();
		}//end method display
	}//end static class Line
	
	//Classe aninhada estática Cube
	public static class Cube{
		private Points cornerPoint;
		private double sideLength;
		
		public Cube(Points cornerPoint, double sideLength) {
			this.cornerPoint = cornerPoint;
			this.sideLength = sideLength;
		}//end constructor Cube
		
		//metodo estatico exclusivo para acessar a classe estatica Cube e seu construtor
		public static Cube creatCube(Points a, double b) {
			return new Cube(a,b);
		}//end metodo estatitico Line para acerros exclusivo a classe Cube e seu construtor
		
		public void display() {
			System.out.println("Cube with corner at: ");
			cornerPoint.display();
			System.out.println("Side leng: " + sideLength);
		}//end method display
	}//end static class Cube
}//end class Space
