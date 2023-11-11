/**
 * CSC 345-01 Assignment #1 (version 1.2)
 * 
 * On my honor, Aaron Canda, this assignment is my own work.  
 * I, Aaron Canda, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Students -- Add your import declarations here


public class A1 {
	
	// Students -- Add your constants here
	public static final int LETTER = 0;
        public static final int DIGIT = 1;
        public static final int UNKNOWN = 99;    
    
    
	public static void main(String[] args) {
		try {
			// Do NOT make any changes to the following TWO lines
			File file = new File("C:/Users/Aaron Canda/Documents/School Documents/WCU/Programming Lang & Paradigms/A1/i1.txt");		
			Scanner sc = new Scanner(file);		//*** Do not make any other Scanners ***//
			
			// *** NOTE ***
			// For this assignment, you are NOT allowed to use any member methods of 
			// class java.util.Scanner except hasNextLine and nextLine.  
			// For example, you CANNOT use any of hasNextInt, nextInt, hasNextFloat, nextFloat, 
			// hasNextDouble and nextDouble for this assignment.  
			
			// Students -- Your code and methods calls go here
			System.out.println(sc.nextLine());
			
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
	}
	
	// Students -- Add your method declarations here



}