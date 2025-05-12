class Rectangle{
	
	int height; 
	int width;
	
Rectangle(int height,int width){
	
	height=height;
	this.width=width;
	
	System.out.println("Just crated a rectangle object with a size (h*w) "+height+"*"+width);
	print(width,height);
}
	
	
	
	
	void print(int width,int height){
		for(int i=0 ; i<height; i++){
			for(int j=0 ; j<width ; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}

class Main{
	public static void main(String[] args){
		Rectangle r1=new Rectangle(3,4);
		Rectangle r2=new Rectangle(5,10);
		Rectangle r3=new Rectangle(8,6);
		Rectangle r4=r1;
		System.out.println("Height "+r1.height+" ,width"+r1.width);
		System.out.println("Height "+r2.height+" ,width"+r2.width);
		System.out.println("Height "+r3.height+" ,width"+r3.width);
		System.out.println("Height "+r4.height+" ,width"+r4.width);

		}

	}
	
