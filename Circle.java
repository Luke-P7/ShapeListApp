public class Circle implements Shape{
    private double radius;

    /**
     * 
     * @param radius
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /**
     * 
     * @return
     */
    public double getRadius(){
        return radius;
    }

    /**    
     * 
     * @return the area of the circle 
     */
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    /**   
     * 
     * @return the class name (Circle)
     */
    @Override 
    public String getClassName(){
        return "Circle";
    }

    /**
     * 
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
    }

    @Override 
    public String toString(){
        return "Circles radius=" + radius;
    }

}
