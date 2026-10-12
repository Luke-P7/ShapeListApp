/**
 * Triangle class
 * Implements the Shape interface and provides methods
 * for calculating the area of a triangle
 */
public class Triangle implements Shape {
    private double base;
    private double height;

    /**
     * Contructor for triangle class
     * initializes the attributes
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Getter method that returns the base
     *
     * @return the base
     */
    public double getBase() {
        return base;
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
     * Mutator method that changes the base
     * 
     * @param base new value for base
     */
    public void setBase(double base) {
        this.base = base;
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
     * Calculates and returns the area of the triangle
     *
     * @return the area of the triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns the class name
     *
     * @return "Triangle"
     */
    @Override
    public String getClassName() {
        return "Triangle";
    }

    /**
     * Returns a string representation of the triangle
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Triangle (base = " + base + " height = " + height + ")";
    }
}