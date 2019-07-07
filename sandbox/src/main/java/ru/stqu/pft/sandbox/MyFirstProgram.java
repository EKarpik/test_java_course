package ru.stqu.pft.sandbox;
public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world!");
		hello("Elena!");
		hello("User!");

	Square s = new Square (3);
	System.out.println("Ploshad kvadrata so storonoi  "+s.l+" = "+ area(s));

	Rectangle r = new Rectangle(32,4);
		System.out.println("Pryamougolnik so storonami  " + r.a + " and " + r.b + " imeet ploshad " +  "=" + ploshad(r));
	}

	public static void hello (String somebody) {
	System.out.println("Hello, " + somebody + "!");
}


public static double area (Square s) {
				return s.l*s.l;
	}
  public static double ploshad (Rectangle r){
		return r.a*r.b;
}
	}

