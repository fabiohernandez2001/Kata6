package Runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.SerialNumberGenerator;

public class NewMain {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        SerialNumberGenerator sng= new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<Car>();
        String command="";
        while (!"exit".equals(command)) {
            command = sc.nextLine();
            if(!"exit".equals(command)){
                Car car=new Car(sng.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("Built cars: "+
                        cars.stream()
                        .map(c->c.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
            }
        }
    }

}
