
class AllInOneDemo{
	
	static void print(String s){
		System.out.println(s);
	}

	
	public static  void main(String[] args){
		Student s1=new Student("charle");
		Student s2=new Student("Don",55);
		Student s3=new Student();
		
		print("Name of The Student S1 is " +s1.name+ " , Marks=" + s1.marks);
		print("Name of The Student S2 is " +s2.name+ " , Marks=" + s2.marks);
		print("Name of The Student S3 is " +s3.name+ " , Marks=" + s3.marks);
		
		
		
		Car c1=new Car("Mazda S3");
		Car c2=new Car("Nissan Navara");
		print("Model of the car c1 is " + c1.getModel());
		print("Model of the car c2 is " + c2.getModel());
	}

}
