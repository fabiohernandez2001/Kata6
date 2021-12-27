
package factories.regionalfactories;

import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanSubmarineToy;

public class AmericanSubmarineToyFactory extends ToyFactory{
    @Override
    public Toy createToy(Integer sng){
        AmericanSubmarineToy submarine = new AmericanSubmarineToy(sng);
        return submarine;
    }
}