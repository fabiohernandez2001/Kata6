
package factories;

public class SerialNumberGenerator {
    private Integer serialNumber=0;
    public Integer next(){
        int aux=serialNumber;
        serialNumber++;
        return Integer.valueOf(aux);
    }
}