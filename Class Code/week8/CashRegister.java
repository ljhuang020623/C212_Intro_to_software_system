/**
 * A simulated cash register that tracks the item count
 * and the total amount due.
 */
public class CashRegister {

    // instance variables
    private int count;
    private double total;

    // default constuctor
    public CashRegister(){
        count = 0;
        total = 0;
    }


    /**
     * constructor taking two arguments
     * @param c
     * @param t
     */
    public CashRegister(int c, double t){
        count = c;
        total = t;
    }

    /**
     * add item to the current sale
     * @param price
     */
    public void addItem(double price){
        total += price;
        count++;
    }

    /**
     * gets the total nubmer of items in the current sale
     * @return
     */
    public int getCount(){
        return count;
    }

    /**
     * get the total sale
     * @return
     */
    public double getTotal(){
        return total;
    }

    /**
     * clears the cash register
     */
    public void clear(){
        total = 0;
        count = 0;
    }

    public void setCount(int c){
        this.count = c;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
