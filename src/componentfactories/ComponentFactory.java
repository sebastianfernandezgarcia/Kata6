
package componentfactories;

import toyproduct.components.*;


public interface ComponentFactory {
    
    Wheel createWheel();
    Engine creeateEngine();
    RotorBlade createRotorBlade();
    
}
