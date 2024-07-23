class SimCard{

   String name;
   String plan;
   
  public boolean createCard(String name,String plan){
	   System.out.println("Talk with Peoples");
	   boolean isCardCreated=false;
	   if(name!=null && plan!=null){
		   this.name=name;
		   this.place=place;
		   isCardCreated=true;
	   }
	   return isCardCreated;
  }
 
 public void displayInfo(){
	 System.out.println(""+this.name);
	 System.out.println(""+this.place);
}
}