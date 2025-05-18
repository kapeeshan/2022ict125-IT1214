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
		static String name;
		static String subjects[]={"IT1113","IT1122","IT1134","IT1144","IT1152"};
		static int credits[]={3,2,4,4,2};
		
		static String grades[]={"A+","A ","A-","B+","B ","B-","C+","C ","C-","D+","D ","E "};
		static float[] gps=new float[5];
		static String[] grd=new String[12];
	
		static float getpoint(String subjectcode,int credit){
			System.out.println("Enter gade for " + subjectcode+":");
			String grade=sc.nextLine();
			return g.gradepoint(grade)*credit;
		}
	
	public static void main(String[] ar){
		String name;
		
		float ogp=0;
		
		
		for(int i=0;i<5;i++){
			ogp+=getpoint(subjects[i],credits[i]);
			
		}

		System.out.println("----------------------------------------------------");
		
		
		System.out.println("Subject Code   |      Grade    | Grade Point  |");
		System.out.println("----------------------------------------------------");
		
		for(int i=0;i<5;i++){
			System.out.println(subjects[i]+"         "+"|      "+grades[i]+"     |      "+credits[i]+      "       |");
		}
	
		System.out.println("----------------------------------------------------");
	}
	
}