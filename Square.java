public class Square implements Shape {
    private double side;

    /**
     * 
     * 
     * @param side
     */
    public void setSide(double side){
        this.side = side;
    }

    /**
     * 
     * 
     * @return
     */
    public double getSide(){
        return side;
    }

    /**    
     * 
     * @return the area of the square 
     */
    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

    /**   
     * 
     * @return the class name (Square)
     */
    @Override 
    public String getClassName(){
        return "Square";
    }

    /**
     * 
     * @param side
     */
    public Square(double side){
        this.side = side;
    }

    @Override 
    public String toString(){
        return "Square (side = " + side + ")";
    }

}
