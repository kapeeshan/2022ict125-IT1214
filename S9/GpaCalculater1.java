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
		
		static Scanner sc=new Scanner(System.in);
		static GPA g=new GPA();
		static String grade;
	
	
		static float getpoint(String subjectcode,int credit){
			System.out.println("Enter gade for " + subjectcode+":");
			grade=sc.nextLine();
			return g.gradepoint(grade)*credit;
		}
	
	public static void main(String[] ar){
		String name;
		String grade;
		float ogp=0;
		
		ogp+=getpoint("IT1113",3);
		ogp+=getpoint("IT1122",2);
		ogp+=getpoint("IT1134",4);
		ogp+=getpoint("IT1144",4);
		ogp+=getpoint("IT1152",2);

		System.out.println("Your Ovearall Gpa is :"+ogp/15 );
	}
	
}