public class Main {

    public static void main(String[] args) {
	// write your code here
        canPack(0, 5, 5);

    }
    
    public static boolean canPack (int bigCount, int smallCount, int goal){ 
        int weightOfBigBag = 5;
        int weightOfSmallBag = 1;

        int counter = 0;
        int totalWeightOfBigBags = 0;
        while(counter < bigCount){
            totalWeightOfBigBags += weightOfBigBag;
            if(totalWeightOfBigBags == goal){
                return true;
            }
            counter++;
        }
        
        if(totalWeightOfBigBags > goal){
            while(totalWeightOfBigBags > goal){
                totalWeightOfBigBags -= weightOfBigBag;
            }
        }

        counter = 0;
        int totalWeightOfSmallBags = 0;
        while (counter < smallCount){
            totalWeightOfSmallBags += weightOfSmallBag;
            if(totalWeightOfSmallBags + totalWeightOfBigBags == goal){
                return true;
            }
            counter++;
        }
        return false;
    }
}
