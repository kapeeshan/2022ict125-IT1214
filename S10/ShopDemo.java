import java.util.Scanner;
class ShopDemo{
	static String description[]={"Bread","Milk Powder","Tooth paste"};
	static int unitPrice[]={160,1060,260};
	
	static byte[] itemBasketIndex=new byte[3];
	static int[] itemBasketQuantity=new int[3];
	static int basketIndex=0;
	
	static void getItems(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Demo Shop");
		System.out.println("Please Select Your Item by Entering the Number");

		char userOption='y';
		do{
			
		for(int i=0; i<description.length; i++){
			System.out.println("Enter "+i+" for "+description[i]);
		}
		 byte itemIndex=sc.nextByte();
		
		System.out.println("You have Chosen "+description[itemIndex]);	
		System.out.println("Unit Price of "+description[itemIndex]+" is "+unitPrice[itemIndex]);
		
		System.out.println("Enter the Quantity");
		int numberOfUnits=sc.nextInt();
		
		itemBasketIndex[basketIndex]=itemIndex;
		itemBasketQuantity[basketIndex]=numberOfUnits;
		basketIndex++;
		
		System.out.println("Enter y to continue, press any character to Exit");
		
		Scanner sc1=new Scanner(System.in);
		userOption=sc1.nextLine().charAt(0); // (char)sc.nextLine();
	}
	while (userOption=='y' && basketIndex<3);
	}
	
	static void showBasket(){
		System.out.println("No \t Item \t Unit Price \t Quantity \t Price");
		
		for(int i=0; i<itemBasketIndex.length; i++){
			System.out.println(i+" \t"+description[itemBasketIndex[i]]+" \t"+unitPrice[itemBasketIndex[i]]+" \t"+itemBasketQuantity[i]+" \t"+unitPrice[itemBasketIndex[i]]*itemBasketQuantity[i]);
			
		}
	}
	
	public static void main(String[] args){
		getItems();
		showBasket();
	}
}