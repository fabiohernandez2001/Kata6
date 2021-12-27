package Runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianCarToyFactory;

public class NewMain {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        ToyBusiness Business=new ToyBusiness();
        Business.add("helicopter", new AmericanHelicopterToyFactory());
        Business.add("car", new AsianCarToyFactory());
        Business.add("submarine", new AmericanSubmarineToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        String command;
        while (!"exit".equals(command=sc.nextLine())) {
            if(null == command){
                System.out.println("Command unknown!");
            }
            else switch (command) {
                case "car":
                case "submarine":
                case "helicopter":
                    toys.add(Business.produceToy(command));
                    System.out.println("Built toys: "+
                            toys.stream()
                                    .map(c->c.toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        }
    }

}
