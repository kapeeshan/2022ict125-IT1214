class ExceptionDemo{
	public static void main(String[] args){
		System.out.println("Start of the Programe");
		int a=10,b=5;
		try{
		int c=a/b;
		int d=Integer.parseInt(args[0]);
		
		}
		catch(Exception e){
			System.out.println("an error occured "+e.getMessage());
		}
		System.out.println("End of the Programe");
	}
}