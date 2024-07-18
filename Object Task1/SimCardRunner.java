class SimCardRunner{
   
   public static void main(String card[]){
	   
	  SimCard ref = new SimCard();
        boolean add =ref.createCard("Jio","299 1.5Gb/day");
         System.out.println(add);
         ref.displayInfo();		 
	
	
	     add =ref.createCard("Airtel","299 1.5Gb/day");
         System.out.println(add);
         ref.displayInfo();
		 
		 
		add =ref.createCard("Uninor","51");
         System.out.println(add);
         ref.displayInfo();
		 
		 add =ref.createCard("China Telecom","902");
         System.out.println(add);
         ref.displayInfo();
		 
		 
		 add =ref.createCard("China Mobile Ltd","556");
         System.out.println(add);
         ref.displayInfo();

  
}
}