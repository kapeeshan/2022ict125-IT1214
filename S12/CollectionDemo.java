import java.util.*;
class Item{
	String name;
	int price;
	Item(String name,int price){
	this.price=price;
	this.name=name;
	}
}


class CollectionDemo{
	public static void main(String[] args){
	/*	int[] a=new int[5];
		a[0]=2;
		a[1]=30;
		a[2]=44;
		a[3]=32;
		a[4]=55;
		 a[5]=100; we cannot do this 
		
		List <Integer> b=new ArrayList<Integer>();
		b.add(2);
		b.add(30);
		b.add(42);
		System.out.println("Element of b are : "+b); */
		
		List <Item> products= new ArrayList<Item>();
		
		products.add(new Item("Milkpowder,1060"));
		products.add(new Item("Bread,130"));
		products.add(new Item("milo,1460"));
		products.add(new Item("TeaMix,960"));
		
		for(Integer element: b){
			System.out.println(element);
		}
		for(Item e: products){
			System.out.println(e.name+" price: "+e.price);
		}
	}
}