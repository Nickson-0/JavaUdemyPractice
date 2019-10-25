public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("24 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("B3-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUp();
    }
}
