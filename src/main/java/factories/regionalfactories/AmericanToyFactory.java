
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory{
    @Override
    public Toy createToy(String type){
        switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.sng.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.sng.next());
                return helicopter;
            default:
                return null;
        }
    }
}