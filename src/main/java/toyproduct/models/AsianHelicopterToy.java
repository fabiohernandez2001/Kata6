
package toyproduct.models;

import toyproduct.Toy;

public class AsianHelicopterToy implements Toy{
    private final Integer serialNumber;
    private final String type = "helicopter";
    public AsianHelicopterToy(Integer serialNumber){
        this.serialNumber=serialNumber;
    }
    @Override
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    public String getType() {
        return this.type;
    }
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d' \n",this.type,this.serialNumber);
    }
    @Override
    public void label(){
        System.out.printf("Labelling '%s' '%d' \n",this.type,this.serialNumber);
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
}