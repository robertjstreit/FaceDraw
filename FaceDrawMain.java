import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

import javax.swing.JOptionPane;

public class FaceDrawMain {
	private static Random rnd;
	/**
	The randomFace function uses the Face constructor to create faces at random locations, 
	of a random size and with a random smile type.
	*/
	public static Face randomFace() {
		return new Face(rnd.nextInt(400),rnd.nextInt(400),50+rnd.nextInt(100),rnd.nextInt(3));
	}
	/**
	The printFaces function prints all the necessary information about each face.
	*/
	public static void printFaces(ArrayList<Face> faces) {
		for (Face f : faces) {
			System.out.println(f);
		}
	}
	/**
	The main function allows the user to specify a number of faces, 
	creates an array list of random faces, prints the faces, and creates/opens the 
	frame that draws the faces.
	*/
	public static void main(String[] args) {
		ArrayList<Face> faces = new ArrayList<Face>();
		rnd = new Random();
		int faceCount = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of faces: "));
		for (int i = 0; i < faceCount; i++) {
			faces.add(randomFace());
		}
		printFaces(faces);
		/**
		FaceFrame takes in the list of faces that it needs to draw. 
		*/
		FaceFrame ff = new FaceFrame(faces);
		/**
		This makes the FaceFrame interface visible to the user.
		*/
		ff.setVisible(true);
	}
}