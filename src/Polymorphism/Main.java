import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
        var vehicles = new ArrayList<Vehicle>();

       var truck = new Truck();
       var sedan = new Sedan();
        var suv = new SUV();

       vehicles.add(truck);
      vehicles.add(sedan);
      vehicles.add(suv);

       for ( Vehicle v: vehicles) {
           System.out.println(v.name()); // <= Polymorphism (late binding) is happening here.
       }
    }
 }