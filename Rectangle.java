// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  public Rectangle(double width, double height){
    this(width, height, 0, 0);
  }

  public Rectangle(){
    this(1, 1, 0, 0);
  }
  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public void scale(double scaleX, double scaleY){
    originX *= scaleX;
    originY *= scaleY;
    width *= scaleX;
    height *= scaleY;
  }

  public void scale(double scaleXY){
    scale(scaleXY, scaleXY);
  }
  
  public boolean isOverlappedWith(Rectangle r){
    if (r.originX + r.width < originX || originX + width < r.originX){//2rx < 1lx, 1rx < 2lx
      return false;
    }
    if (r.originY + r.width < originY || originY + width < r.originY){//2rx < 1lx, 1rx < 2lx
      return false;
    }
    return true;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith(r2);
  }

  public double calcRatio(){
    return width / height;
  }

  public boolean isSquare(){
    double ratio = calcRatio();
    return ratio > 0.999 && ratio < 1.001;
  }
}
