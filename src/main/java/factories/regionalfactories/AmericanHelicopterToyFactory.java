
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory{
    @Override
    public Toy createToy(Integer sng){
        AmericanHelicopterToy helicopter = new AmericanHelicopterToy(sng);
        return helicopter;
    }
}