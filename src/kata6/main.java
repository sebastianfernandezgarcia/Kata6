package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;
import factories.SerialNumberGenerator;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;

public class main {
    
    public static void main(String[] args) {
         
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        business.add("submarine", new AmericanSubmarineToyFactory());
        //ToyBusiness business = new ToyBusiness(new AsianToyFactory());
        //ToyBusiness business = new AsianToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
                
        SerialNumberGenerator generator = new SerialNumberGenerator();

       Scanner in = new Scanner(System.in);
       String line = "";
       while(!line.equals("exit")) {
           line = in.nextLine();
           
           switch (line) {
                case "car": 
                case "helicopter": 
                case "submarine":
                    toys.add(business.produceToy(line));
                    System.out.println("Built toys: "+toys.stream()
                                                 .map(c -> c.toString())
                                                    .collect(Collectors.joining(", ")));
                    break;
                    
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown!");
              
           }
       }
       
    }
    
}
