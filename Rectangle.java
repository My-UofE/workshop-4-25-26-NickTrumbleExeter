// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

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

  public double getWidth() { return width; }

  public double getHeight() { return height; }

  public double getOriginX() { return originX; }

  public double getOriginY() { return originY; }

  public void setWidth(double width) { 
    if (width < 0)
      return;
    this.width = width; 
  }

  public void setHeight(double height) { 
    if (height < 0)
      return;
    this.height = height; 
  }

  public void setOriginX(double originX) { this.originX = originX; }

  public void setOriginY(double originY) { this.originY = originY; }

  // Return a description of a rectangle in the form of
  // Rectangle[x=*,y=*,w=*,h=*]
  public String toString(){
    return "Rectangle[x="+originX+",y="+originY+",w="+width+",h="+height+"]";
  }
}
