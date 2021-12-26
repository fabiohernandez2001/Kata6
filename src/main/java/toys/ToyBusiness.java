
package toys;

import toyproduct.Toy;
import toyproduct.models.HelicopterToy;
import toyproduct.models.CarToy;

public class ToyBusiness {
    private final SerialNumberGenerator sng = new SerialNumberGenerator();
    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(this.sng.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.sng.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
}