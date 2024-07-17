class PenRunner{

public static void main(String pen[]){

//className ref=new className;


Pen value=new Pen();
value.name="Parker";
value.id= 1;
value.color="Black";
value.price=250.00;


System.out.println("The Brand Name is:"+value.name);
System.out.println("The id of the brand is:"+value.id);
System.out.println("The color of the pen is:"+value.color);
System.out.println("The price of the pen is:"+value.price);

Pen ref =new Pen();
ref.name="Writo Meter";
ref.id=2;
ref.color="blue";
ref.price=25.00;


System.out.println("The Brand Name is:"+ref.name);
System.out.println("The id of the brand is:"+ref.id);
System.out.println("The color of the pen is:"+ref.color);
System.out.println("The price of the pen is:"+ref.price);
 
}
}