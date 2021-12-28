package toyproduct.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toyproduct.Toy;
import toyproduct.components.Engine;
import toyproduct.components.Wheel;


public class AmericanCarToy implements Toy{
    final private Integer serialNumber;
    
    final String type = "car";
    final ComponentFactory factory;
    private Engine engine;
    final private Wheel[] wheels = new Wheel[4];
    
    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.factory = new AmericanComponentFactory();
    }
    
    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
        public String getType() {
        return type;
    }
    
    
    @Override
    public void pack() {
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
        }
    
    @Override
    public void label() {
        System.out.printf("Labelling '%s''%d'\n", this.type,  this.serialNumber);
    }
    
    @Override
    public void prepare() {
        this.engine = this.factory.creeateEngine();
        for (int i = 0; i<this.wheels.length-1; i++) {
            this.wheels[i] = this.factory.createWheel();
        }
    }
     
    @Override 
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }


    
}
