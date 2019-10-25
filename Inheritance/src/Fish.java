public class Fish extends Animal {

    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int size, int weight, int eyes, int gills, int fins) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
