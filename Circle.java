/**
 * Circle class implements Shape interface, and it overrides getArea() and getClassName()
 * with its respective logic. This class represents a Circle with a radius and calculates
 * the area.
 */
public class Circle implements Shape{
    private double radius;

    /**
     * This method sets the radius of the circle.
     * 
     * @param radius the radius of the circle
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /**
     * This method returns the radius of the circle.
     * 
     * @return radius the radius of the circle
     */
    public double getRadius(){
        return radius;
    }

    /**    
     * This method overrides getArea() from the implemented Shape interface
     * to return the area of the circle.
     * 
     * @return the area of the circle 
     */
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    /**   
     * This method overrides getClassName() from the implemented Shape interface
     * to return the name of this class (Circle).
     * 
     * @return the class name (Circle)
     */
    @Override 
    public String getClassName(){
        return "Circle";
    }

    /**
     * This is the constructor for Circle and it creates a Circle 
     * with the given radius.
     * 
     * @param radius the radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**   
     * This method overrides toString() to return Circle with its
     * radius.
     * 
     * @return a string that has Circle with its radius
     */
    @Override 
    public String toString(){
        return "Circle (r = " + radius + ")";
    }

}
