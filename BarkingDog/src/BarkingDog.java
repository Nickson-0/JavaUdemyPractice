public class BarkingDog {

    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay){

        if(!isBarking)
            return false;

        if(hourOfDay < 8 || hourOfDay > 22){
            if(hourOfDay >= 0 && hourOfDay <=23){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
}
