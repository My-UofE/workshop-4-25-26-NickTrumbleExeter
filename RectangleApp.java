// An application to create and manipulate rectangles
public class RectangleApp {
	//To be excutable, need a main method
	public static void main( String[] args ) {
		System.out.println("Creating myRect1");
		
		Rectangle myRect1; //myRect is not instantiated
		myRect1 = new Rectangle(20.0, 8.0,30,30); //instantiated
		
		//static field
		System.out.println("Rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");
		//instance fields
		System.out.println("Width: "+myRect1.width+", Height: "+myRect1.height);
		System.out.println("Origin is: "+myRect1.originX+","+myRect1.originY);
		//calling methods
		System.out.println("Area: "+myRect1.getArea());
		
		System.out.println("\nMoving myRect1");
		myRect1.move(0,10);//the object's state is changed
		System.out.println("Origin is: "+myRect1.originX+","+myRect1.originY);

		System.out.println("Changing width of myRect1");
		myRect1.width = 16;//the object's state is changed
		System.out.println("Width: "+myRect1.width+", Height: "+myRect1.height);

		
		System.out.println("Creating myRect2");
		Rectangle myRect2 = new Rectangle(20.0, 8.0);
		System.out.println("Width: "+myRect2.width+", Height: "+myRect2.height);
		System.out.println("Origin: "+myRect2.originX+","+myRect2.originY);
		 


		
		System.out.println("Creating myRect3");
		Rectangle myRect3 = new Rectangle(); 
		System.out.println("Width: "+myRect3.width+", Height: "+myRect3.height);
		System.out.println("Origin: "+myRect3.originX+","+myRect3.originY);
		 

	}
}
