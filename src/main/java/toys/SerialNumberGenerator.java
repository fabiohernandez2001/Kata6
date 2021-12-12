
package toys;

public class SerialNumberGenerator {
    private int serialNumber=0;
    public int next(){
        int aux=serialNumber;
        serialNumber++;
        return aux;
    }
}