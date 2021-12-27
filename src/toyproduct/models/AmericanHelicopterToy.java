package toyproduct.models;

import toyproduct.Toy;


public class AmericanHelicopterToy implements Toy{
    final private Integer serialNumber;
    
    final String type = "helicopter";
    
    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
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
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
 
}
