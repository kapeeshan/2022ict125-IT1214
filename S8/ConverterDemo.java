/*
Type conversion and Type casting

boolean
short
char
long
int
float
double
String
*/

class ConverterDemo{
	
	public static void main(String[] args){
		boolean bo=true;
		byte by=127;
		short sh=45;
		char ch='a';
		long lo=452;
		int in=456;
		//float fl=16.2314548f;
		float fl=3/2f;
		double db=78.45421;
		String st="Hi";
		
		lo=by;
		sh=(short)lo;
		fl=(float)db;
		in=(int)db;
		in=(int)ch;
		in=100;
		ch=(char)in;
		System.out.println("Value of boolean is : " + bo);
		System.out.println("Value of byte is : " + by);
		System.out.println("Value of short is : " + sh);
		System.out.println("Value of char is :" + ch);
		System.out.println("Value of long is : " + lo);
		System.out.println("Value of int is : " + in);
		System.out.println("Value of float is : " + fl);
		System.out.println("Value of double is : " + db);
		System.out.println("Value of String is : " + st);
	}
	
}