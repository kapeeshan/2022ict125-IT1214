//this is a line comment
// this is our first java program


import java.io.*; //this how import packages

class ArgsClass{ // class name should start with capitale letter
	
	public static void main(String[] args){
		System.out.println("This prints in a newline "+args[0]);// if string args then args or ar then ar
		System.out.println("This is in a new line"+args[1]);
		System.out.println(args[2]);
	}
}