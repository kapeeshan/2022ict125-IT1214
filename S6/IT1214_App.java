class Student{
	int marks;
	String name;
	
	Printer p=new Printer();
	
	Student(String name, int marks){
	   p.print("name of the student "+name+" Marks : "+marks);
	   
	}
	Student(){
		marks=20;
		name="ksaks";
	}
}
class Printer{
	void print(String s){
	System.out.println(s);
	}
}

class App{
	public static void main(String[] args){
		Printer p=new Printer();
		p.print("Welcome to demo class App");
		Student s1=new Student("bob",50);
		
		p.print("student s1 marks : " + s1.marks);
		
		Student s2=new Student();
		s2.marks=90;
		//p.print("name of the student "+s2.name+" Marks : "+s2.marks);
		s2.name="ron";
		p.print("name of the student "+s2.name+" Marks : "+s2.marks);
	}
}