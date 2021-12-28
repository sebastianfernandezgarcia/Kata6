package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanSubmarineToy;


public class AmericanCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
            return new AmericanCarToy(serialNumber);
    }
    
}
