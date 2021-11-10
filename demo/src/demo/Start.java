package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "";
		System.out.print("Introduce tu nombre: ");
		Scanner sn = new Scanner(System.in);
		
		name= sn.next();
		System.out.print("Hola "+ name);

	}

}
