public class MercedesBenzModelX extends Car {

    private int roadServiceMonths;

    public MercedesBenzModelX(int roadServiceMonths) {
        super("OutLander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }
    }
}
