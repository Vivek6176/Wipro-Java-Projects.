import java.util.*;
public class Votes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int x=sc.nextInt();
		double bv=(x-(0.2*x))*0.45;
		System.out.println("Total Valid Votes of B "+ bv);
}}
