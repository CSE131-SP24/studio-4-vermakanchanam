package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.nextLine(); 
		int redComponent = in.nextInt(); 
		int greenComponent = in.nextInt(); 
		int blueComponent = in.nextInt(); 
		boolean isFillied = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeigth= in.nextDouble();
		StdDraw.setPenColor(Color.GREEN);  
		

		
    }	
}
