class Garden{
   
   String name;
   String place;
   
     public boolean createGarden(String name,String place){
	   System.out.println("Nature fresh");
	    boolean isGardenCreated=false;
		if(name!=null && place!=null){
			this.name=name;
			this.place=place;
			isGardenCreated=true;
		} 
		return isGardenCreated;
	 }
	 
   public void displayInfo(){
	  
	   System.out.println("The Garden name is :"+this.name);
	   System.out.println("The place of the garden is :"+this.place);
	  
}
}