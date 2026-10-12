/**
 * Rectangle class
 * Implements the Shape interface and provides methods
 * for calculating the area of a rectangle
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    /**
     * Contructor for rectangle class
     * initializes the attributes
     *
     * @param width the widht of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Getter method that returns the height
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Getter method that returns the width
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Mutator method that changes the height
     * 
     * @param height new value for height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Mutator method that changes the width
     * 
     * @param width new value for width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculates and returns the area of the rectangle
     *
     * @return the area of the rectangle
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Returns the class name
     *
     * @return "Rectangle"
     */
    @Override
    public String getClassName() {
        return "Rectangle";
    }

    /**
     * Returns a string representation of the rectangle
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Rectangle (width = " + width + " height = " + height + ")";
    }
}