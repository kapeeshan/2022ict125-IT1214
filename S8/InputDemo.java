import java.util.*;

class InputDemo{
	
	public static void main(String[] ar){
		String name;
		int age;
		byte marks;
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi Enter Your Name");
		name=sc.nextLine();
		System.out.println("Hi Enter Your Age");
		age=sc.nextInt();
		System.out.println("Hi Enter Your Marks");
		marks=sc.nextByte();
		System.out.println("Hi Enter Your Grade");
		grade=sc.nextChar();
		System.out.println("Hello "+name +" How are you?");
		System.out.println("Your age is "+age +" Your marks is "+marks+" "+grade);
	}
	
}