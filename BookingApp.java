import java.util.Scanner;

abstract class Ride {
    abstract int calculateFare(int distance);

    public void rideType() {
        System.out.println("Generic Ride");
    }
}

class AutoRide extends Ride {

    public int calculateFare(int distance) {
       return distance * 10;
    }

    public void rideType() {
        System.out.println("Auto Ride");
    }
}

class CarRide extends Ride {

    public int calculateFare(int distance) {
        return distance * 20;

    }

    public void rideType() {
        System.out.println("Car Ride");
    }
}

public class BookingApp {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the ride type (auto/car):");
    String type = sc.nextLine();

    System.out.println("Enter the distance in kilometers:");
    int distance = sc.nextInt();

    Ride ride;

    if (type.equals("auto")) {
            ride = new AutoRide();
        } 
        else if (type.equals("car")) {
            ride = new CarRide();
        } 
        else {
            System.out.println("Invalid ride type!");
            sc.close();
            return;
        }

      ride.rideType();
        int fare = ride.calculateFare(distance);
        System.out.println("Total fare for " + distance + " km: ₹" + fare);
        sc.close();
  }
}
