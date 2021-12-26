
package toys;

public class ToyBusiness {
    private final SerialNumberGenerator sng= new SerialNumberGenerator();
    public Car createCar(){
        Car car =new Car(this.sng.next());
        car.pack();
        car.label();
        return car;
    }
    public Helicopter createHelicopter(){
        Helicopter helicopter =new Helicopter(this.sng.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}