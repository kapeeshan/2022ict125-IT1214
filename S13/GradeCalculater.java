class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	 public String getName() {
            return name;
        }
	
	Student(String name,int a,int b,int c){
		
		if((a>0 && a<100)&&(b>0 && b<100)&&(c>0 && c<100)){
		this.name=name;
		exam1=a;
		exam2=b;
		exam3=c;
		}
		else{
			System.out.println("Exam scores must be between 0 and 100");
		}
	}
	
	double CalculateAverage(){
		double average;
		average=(exam1+exam2+exam3)/3;
		return average;
	}
}
class Calculater{
	public static void main(String[] args){
		try{
		Student s1=new Student("John",75,110,90);
		System.out.println("name :  "+s1.getName()+"      average :" + s1.CalculateAverage());
		}
		catch(Exception e){
			System.out.println("error"+e.getMessage());
		}
	}
}