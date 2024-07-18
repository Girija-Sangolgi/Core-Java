class SunGlassesRunner{
  
  public static void main(String args[]){

  SunGlasses ref = new SunGlasses();
  boolean value = ref.createGlass("Oakley","sports Equipment",6000.00);
  System.out.println(value);
  ref.displayInfo();
  
  value = ref.createGlass("Ray-Ban","eyeglasses",7000.00);
  System.out.println(value);
  ref.displayInfo();
  
  value = ref.createGlass("Gucci","eyeglasses",600.00);
  System.out.println(value);
  ref.displayInfo();
  
  value = ref.createGlass("persol","eyewear",8000.00);
  System.out.println(value);
  ref.displayInfo();
  
  value = ref.createGlass("Prada","Styles and Designs",900.00);
  System.out.println(value);
  ref.displayInfo();
  
 
}
}