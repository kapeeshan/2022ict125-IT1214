class Student{
	int marks=100;
	String name="kapeesh";
	
	Student(String n){
		name=n;
	}
	Student(String n,int m){
		name=n;
		marks=m;
	}
}







class Studentmarks{
	public static void main (String[] ar){
		System.out.println("From Student Demo Class");
		System.out.println("Creat an Object of Student Class");
		Student s1=new Student("NIce name",85);
		//s1.marks=80;
		//s1.name="kapeeshan";
		System.out.println("Name is "+s1.name);
		System.out.println("Marks is "+s1.marks);
	}
}


class StudentDemo{
	
	private static void main (String[] ar){
		System.out.println("From Student Demo Class");
		System.out.println("Creat an Object of Student Class");
		Student s1=new Student("kapeeshan",79);
		//s1.marks=90;
		//s1.name="kapeeshan";
		System.out.println("Name is "+s1.name);
		System.out.println("Marks is "+s1.marks);
	}
}
