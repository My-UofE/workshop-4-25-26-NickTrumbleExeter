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
		 
		myRect1.scale(0.5); // applies 0.5 scale to both x and y, changing width to 8, height to 4

		myRect2.scale(1,3); // should change height to 24 with width unchanged

		myRect3.scale(15,10); // should scale to width 15, height 10


		System.out.println("\nRect1:");
		System.out.println("Width: "+myRect1.width+", Height: "+myRect1.height);
		System.out.println("Origin: "+myRect1.originX+","+myRect1.originY);
	
	
		System.out.println("\nRect2:");
		System.out.println("Width: "+myRect2.width+", Height: "+myRect2.height);
		System.out.println("Origin: "+myRect2.originX+","+myRect2.originY);
		
		System.out.println("\nRect3:");
		System.out.println("Width: "+myRect3.width+", Height: "+myRect3.height);
		System.out.println("Origin: "+myRect3.originX+","+myRect3.originY);
	

		Rectangle myRect4 = new Rectangle(30.0, 5.0, 10, 10); 
		Rectangle myRect5 = new Rectangle(50.0, 20.0, 0, 0); 
		Rectangle myRect6 = new Rectangle(20.0, 40.0, 500, 500); 

		// myRect4 overlaps myRect5 so these should show as true
		System.out.println( "myRect4 overlaps myRect5: " + myRect4.isOverlappedWith(myRect5) ) ; 
		System.out.println( "myRect5 overlaps myRect4: " + myRect5.isOverlappedWith(myRect4) ) ;

		// myRect4 does not overlap myRect6 so these should show as false
		System.out.println( "myRect4 overlaps myRect6: " + myRect4.isOverlappedWith(myRect6) ) ;
		System.out.println( "myRect6 overlaps myRect4: " + myRect6.isOverlappedWith(myRect4) ) ;
	}
}
