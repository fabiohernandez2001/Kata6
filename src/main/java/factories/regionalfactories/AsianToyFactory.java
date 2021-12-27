
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory{
    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                AsianCarToy car = new AsianCarToy(this.sng.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.sng.next());
                return helicopter;
            default:
                return null;
        }
    }
}