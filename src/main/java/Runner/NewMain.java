package Runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.ToyBusiness;

public class NewMain {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        ToyBusiness Business=new ToyBusiness();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        String command;
        while (!"exit".equals(command=sc.nextLine())) {
            if(null == command){
                System.out.println("Command unknown!");
            }
            else switch (command) {
                case "car":
                    cars.add(Business.createCar());
                    System.out.println("Built cars: " +
                            cars.stream()
                                    .map(c->c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                case "helicopter":
                    helicopters.add(Business.createHelicopter());
                    System.out.println("Built helicopters: "+
                            helicopters.stream()
                                    .map(c->c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
        }
    }

}
