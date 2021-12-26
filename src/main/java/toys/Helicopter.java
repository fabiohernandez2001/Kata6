
package toys;

public class Helicopter {
    private final Integer serialNumber;
    private final String type="helicopter";
    public Helicopter(Integer serialNumber){
        this.serialNumber=serialNumber;
    }
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    public String getType() {
        return this.type;
    }
    public void pack(){
        System.out.printf("Packing '%s' '%d' \n",this.type,this.serialNumber);
    }
    public void label(){
        System.out.printf("Labelling '%s' '%d' \n",this.type,this.serialNumber);
    }
}