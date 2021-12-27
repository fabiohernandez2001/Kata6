
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{
    @Override
    public Toy createToy(Integer sng){
        AmericanCarToy car = new AmericanCarToy(sng);
        return car;
    }
}