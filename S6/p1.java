class Paper{
	int length,width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("created a document d");
		d.name="My first class";
		System.out.println("created a document d " + d.name);
		
		Document d2=new Document();
		System.out.println("created a document d2");
		d2.name="My second class";
		System.out.println("created a document d2 " + d2.name);
		d.p=new Paper();
		d.p.length=16;
		d.p.width=10;
		d.p.text="this i sthe text in my first document";
		System.out.println("size of paper of a document " + d.p.length+ " * "+d.p.width);
		System.out.println("content document " + d.p.text);
		
		
		Document d3=new Document();
		System.out.println("Created a new document d3");
		d3.name="My third document";
		System.out.println("created a document d3 " + d3.name);
	}
}