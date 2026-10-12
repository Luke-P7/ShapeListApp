/**
 * Square class implements Shape interface, and it overrides getArea() and getClassName()
 * with its respective logic. This class represents a Square with a side length and calculates
 * the area.
 */
public class Square implements Shape {
    private double side;

    /**
     * This method returns the side length of the Square.
     * 
     * @param side length of one side of the square
     */
    public void setSide(double side){
        this.side = side;
    }

    /**
     * This method returns one side length of the square.
     * 
     * @return side length of one side of the square
     */
    public double getSide(){
        return side;
    }

    /**    
     * This method overrides getArea() from the implemented Shape interface
     * to return the area of the Square.
     * 
     * @return the area of the square 
     */
    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

    /**   
     * This method overrides getClassName() from the implemented Shape interface
     * to return the name of this class (Square).
     *  
     * @return the class name (Square)
     */
    @Override 
    public String getClassName(){
        return "Square";
    }

    /**
     * This is the constructor for Square and it creates a Square
     * with the given side. 
     * 
     * @param side length of one side of the square
     */
    public Square(double side){
        this.side = side;
    }

    /**   
     * This method overrides toString() to return Square with its
     * side.
     *  
     * @return a string that has Square with its side
     */
    @Override 
    public String toString(){
        return "Square (side = " + side + ")";
    }

}