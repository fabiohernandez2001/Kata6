
package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
    public Toy produceToy(Integer type){
        Toy toy=this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    protected abstract Toy createToy(Integer Toy);

}