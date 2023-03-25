
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int difference(Apartment compared) {
        return this.squares * this.pricePerSquare - compared.squares * compared.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        if (difference(compared) < 0) {
            return -1 * difference(compared);
        }
        return difference(compared);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (difference(compared) < 0) {
            return false;
        }
        return true;
    }
}
