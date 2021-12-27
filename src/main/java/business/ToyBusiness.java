
package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

public class ToyBusiness {
    private final SerialNumberGenerator sng = new SerialNumberGenerator();
    private final Map<String,ToyFactory> toyFactory=new HashMap<>();
    public Toy produceToy(String type){
        return this.toyFactory.get(type).produceToy(this.sng.next());
    }
    public void add(String name, ToyFactory toyfactory){
        this.toyFactory.put(name, toyfactory);
    }
}