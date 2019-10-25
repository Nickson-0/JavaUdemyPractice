
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engineer;
    private String colour;

    public void setModel (String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("comondore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel (){
        return this.model;
    }

}
