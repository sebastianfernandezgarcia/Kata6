
package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;
import toyproduct.components.american.*;


public class AmericanComponentFactory implements ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine creeateEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }
    
}
