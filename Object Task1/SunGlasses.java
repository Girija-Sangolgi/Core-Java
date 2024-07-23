class SunGlasses{

 String name;
 String type;
 double price;
 
 public boolean createGlass(String name,String type,double price){
	 System.out.println("Wear to look Handsome");
	 boolean isGlassCreated=false;
	 if(name!=null && type!=null && price>0){
		 this.name=name;
		 this.type=type;
		 this.price=price;
		 isGlassCreated=true;
	 }
	 return isGlassCreated;
	
}

public void displayInfo(){
	System.out.println("The name of the sun glass is: "+this.name);
	System.out.println("The type of the sun glass is: "+this.type);
	System.out.println("The price of the Sun glass is: "+this.price);
}
}