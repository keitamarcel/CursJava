package Curs6;

public class Room {

	private int lenght;
	private int width;
	
	//constructor
	public Room(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
		//--------------
	}
	// folosim clasa pt calcul m2 pt bucatarie
	
	public int calculateSqareArea() {
		return lenght * lenght;
	}
	public int calculateRectangleArea() {
		return lenght * width;
		
	}
	
	
	
}
