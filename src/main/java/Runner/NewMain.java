package Runner;

import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;
import business.ToyBusiness;

public class NewMain {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        ToyBusiness AmericanBusiness=new AmericanToyBusiness();
        ToyBusiness AsianBusiness=new AsianToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        String command;
        while (!"exit".equals(command=sc.nextLine())) {
            if(null == command){
                System.out.println("Command unknown!");
            }
            else switch (command) {
                case "car":
                case "helicopter":
                    toys.add(AsianBusiness.createToy(command));
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
