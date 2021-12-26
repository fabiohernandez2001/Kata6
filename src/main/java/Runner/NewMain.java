package Runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class NewMain {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        SerialNumberGenerator sng= new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<Car>();
        ArrayList<Helicopter> helicopters = new ArrayList<Helicopter>();
        String command;
        while (!"exit".equals(command=sc.nextLine())) {
            if(null == command){
                System.out.println("Command unknown!");
            }
            else switch (command) {
                case "car":
                    Car car=new Car(sng.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built cars: "+
                            cars.stream()
                                    .map(c->c.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                case "helicopter":
                    Helicopter helicopter=new Helicopter(sng.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
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
