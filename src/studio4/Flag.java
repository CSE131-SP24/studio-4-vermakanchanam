package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN);   
		StdDraw.filledRectangle(.165, 0.5, 0.125, 0.375);
		StdDraw.setPenColor(Color.blue);   
		StdDraw.filledRectangle(.40, 0.5, 0.125, 0.375);
		StdDraw.setPenColor(Color.red);   
		StdDraw.filledRectangle(.65, 0.5, 0.125, 0.375); 
		StdDraw.setPenColor(Color.cyan);   
		StdDraw.filledRectangle(0.9, 0.5, 0.125, 0.375);
		
	}
}