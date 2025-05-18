import java.util.*;

class GPA{
	
	float gradepoint(String grade){
		float gp=0.00f;
		/* if(grade.equals("A+") || grade.equals("A") ){
			gp=4f;
		}else(grade.equals("A-")){
			if{
				
			} */
			
		switch(grade){
			case "A+":
			gp=4f;
			break;
			
			case "A":
			gp=4f;
			break;
			
			case "A-":
			gp=3.7f;
			break;
			
			case "B+":
			gp=3.3f;
			break;
			
			case "B":
			gp=3f;
			break;
			
			case "B-":
			gp=2.7f;
			break;
			
			case "C+":
			gp=2.3f;
			break;
			
			case "C":
			gp=2f;
			break;
			
			case "C-":
			gp=1.7f;
			break;
			
			case "D+":
			gp=1.3f;
			break;
			
			case "D":
			gp=1f;
			break;
			
			case "E":
			gp=0;
			break;
			
		}
		
		return gp;
		
		}

}
	


class Demo{
	
	public static void main(String[] ar){
		String name;
		float ogp,ogpa;
		String grade;
		float point;
		
		
		Scanner sc=new Scanner(System.in);
		GPA g=new GPA();
		
		
		System.out.println("Hi Enter Your Name:");
		name=sc.nextLine();
		System.out.println("Hi "+name+" Enter your Results Acoding to the course code");
		
		System.out.println("IT1113");
		
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogp=point*3;
		
		System.out.println("IT1122");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogp=ogp+point*2;
		
		System.out.println("IT1134");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogp=ogp+point*4;
		
		System.out.println("IT1144");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogp=ogp+point*4;
		
		System.out.println("IT1152");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogp=ogp+point*2;
		
		ogpa=ogp/15;
		System.out.println("Your Ovearall Gpa is :"+ogpa );
	}
	
}