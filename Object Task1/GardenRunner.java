class GardenRunner{

   public static void main(String args[]){
	   
	   Garden ref= new Garden();
	   boolean addvalue =ref.createGarden("Lalbagh","Banglore");
	   System.out.println(addvalue);
	   ref.displayInfo();
	   
	   addvalue =ref.createGarden("NTR Garden","Hyderabad");
	   System.out.println(addvalue);
	   ref.displayInfo();
	   
	   addvalue =ref.createGarden("Botonical Garden","Pune");
	   System.out.println(addvalue);
	   ref.displayInfo();
	   
	   addvalue =ref.createGarden("Rose Garden","Indo-Africa");
	   System.out.println(addvalue);
	   ref.displayInfo();
	   
	   addvalue =ref.createGarden("Cubbon Park","Bengaluru");
	   System.out.println(addvalue);
	  
   
}
}