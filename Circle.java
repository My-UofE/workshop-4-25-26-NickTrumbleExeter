public class Circle {
    private double radius;
    private double originX;
    private double originY;

    public Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;

        if (radius < 0)
            radius = 1;
    }

    public Circle(double radius){
        this(radius, 0, 0);
    }

    public Circle(){
        this(1, 0, 0);
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) {
        if (radius < 0) 
            return;
        this.radius = radius;
    }

    public double getOriginX() { return originX; }

    public void setOriginX(double originX) { this.originX = originX; }

    public double getOriginY() { return originY; }

    public void setOriginY(double originY) { this.originY = originY; }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public void move(double dx, double dy){
        originX += dx;
        originY += dy;
    }

    public String toString(){
        return "Circle[radius:"+radius+",originX:"+originX+",originY:"+originY+"]";
    }

    public void scale(double scaleXY){
        originX *= scaleXY;
        originY *= scaleXY;
        radius *= scaleXY;
    }

    public boolean isOverlappedWith(Circle r1){
        if (Math.abs(r1.originX - originX) < radius + r1.radius){
            if (Math.abs(r1.originY - originY) < radius + r1.radius)
                return true;
        }
        return false;
    }

    public boolean isEnclosedBy(Circle c1){
        if (Math.abs(c1.originX - originX) < c1.radius - radius){
            if (Math.abs(c1.originY - originY) < c1.radius - radius)
                return true;
        }
        return false;
    }
}
