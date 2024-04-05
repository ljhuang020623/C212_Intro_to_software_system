public class Counter {

    // instance variable
    private int count = 0;

    /**
     * increment the counter
     */
    public void increment(){
        count++;
    }

    /**
     * get the current count
     * @return
     */
    public int getCount(){
        return count;
    }

    /**
     * reset the counter
     */
    public void reset(){
        count = 0;
    }
}
