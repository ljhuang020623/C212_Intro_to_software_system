public class CashRegisterTester {

    public static void main(String[] args) {

        // create a cash register object
        CashRegister register1 = new CashRegister(9, 78);

        // add three items
        register1.addItem(5.8);
        register1.addItem(59.8);
        register1.addItem(12.887);

        System.out.println("No if items in current sale " + register1.getCount());
        System.out.println("Amount due " + register1.getTotal());

        CashRegister register2 = new CashRegister(10, 500);

        register2.addItem(59.0);

        System.out.println("No of items in register 2 is " + register2.getCount());


    }
}
