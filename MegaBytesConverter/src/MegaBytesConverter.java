public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
       if (kiloBytes < 0){
           System.out.println("Invalid value");
       }else {
           int megaBytes = kiloBytes/1024;
           long kiloBytesRemaining = (kiloBytes % 1024);
           System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " +
                   kiloBytesRemaining + " KB");
       }
    }
}
