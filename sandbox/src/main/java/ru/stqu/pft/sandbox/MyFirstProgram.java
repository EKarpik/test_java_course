package ru.stqu.pft.sandbox;
public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world!");
		hello("Elena!");
		hello("User!");

	Square s = new Square (3);
	System.out.println("Ploshad kvadrata so storonoi  "+s.l+" = "+ s.area());

	Rectangle r = new Rectangle(32,4);
		System.out.println("Pryamougolnik so storonami  " + r.a + " and " + r.b + " imeet ploshad " +  "=" + r.ploshad());
	}

	public static void hello (String somebody) {
	System.out.println("Hello, " + somebody + "!");
}



	}

