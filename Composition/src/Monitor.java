public class Monitor {

    private String Model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        Model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt (int x, int y, String colour) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + colour);
    }
}
