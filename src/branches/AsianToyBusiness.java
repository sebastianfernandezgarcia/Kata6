package branches;

import business.ToyBusiness;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AsianCarToy;
import toyproduct.models.AsianHelicopterToy;


public class AsianToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "car":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
                
            default:
                return null;
        }
    }
    
}
