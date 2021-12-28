package business;

import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;
import factories.SerialNumberGenerator;
import factories.ToyFactory;


public class ToyBusiness {
    
    private final ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type) {
        return this.toyFactory.produceToy(type);
    }

}
