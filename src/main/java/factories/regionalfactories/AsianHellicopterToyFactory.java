
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianHelicopterToy;

public class AsianHellicopterToyFactory extends ToyFactory{
    @Override
    public Toy createToy(Integer sng){
        AsianHelicopterToy helicopter = new AsianHelicopterToy(sng);
        return helicopter;
    }
}