
package toys;

public class Car {
        private final Integer serialNumber;
    public Car(Integer serialNumber){
        this.serialNumber=serialNumber;
    }
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    public void pack(){
        System.out.println("Packing car: "+this.getSerialNumber());
    }
    public void label(){
        System.out.println("Labelling car: "+this.getSerialNumber());

    }
        
}