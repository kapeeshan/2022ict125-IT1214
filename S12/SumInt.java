import java.util.Scanner;
class SumDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 10 Intigers");
		int sum=0;
		
		for(int i=0;i<10;i++){
			System.out.println("Input Intiger "+(i+1)+": ");
			try{
			sum +=Integer.parseInt(sc.nextLine()) ;
			}
			catch(Exception e){
			System.out.println("an error occured "+e.getMessage());
			i=i-1;
			}
		}	
		System.out.println("Sum of 10 intigers is: "+sum);
	}
}