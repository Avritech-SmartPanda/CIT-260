package Week12;

/**
 * @author Daphne Avril Museruka
 */
public class Square extends Shape {
    private double size;

    /**
     * Creates a Square with the provided id and size
     * @param id the desired id of the square
     * @param size the desired size of the square
     */
    public Square(int id, double size) {
        super(id);
        this.setSize(size);
    }

    /**
     * Gets the size of the Square
     * @return the size of the square
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the Square
     * @param size the desired size of the square
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Calculates the area of the square
     * @return the area of the square
     */
    public double getArea(){
        return this.getSize() * this.getSize();
    }
}