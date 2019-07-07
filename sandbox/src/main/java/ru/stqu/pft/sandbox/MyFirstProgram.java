package ru.stqu.pft.sandbox;
public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world!");
		hello("Elena!");
		hello("User!");

	double len = 5;
	System.out.println("Площадь квадрата со стороной"+len +"="+ area (len));

	double s = 34;
	double d = 2;
	System.out.println("Pryamougolnik so storonami" + s + "и" + d + "imeet ploshad" + ploshad(s,d));
	}

	public static void hello (String somebody) {
	System.out.println("Hello, " + somebody + "!");
}


	 public static double area (double l) {
				return l*l;
	}
public static double ploshad (double a, double b){
		return a*b;
}
	}

