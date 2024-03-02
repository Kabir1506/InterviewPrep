package LLD.Strategy.StrategySol;

public class Main {
    public static void main(String[] args) {
        Vehicle passengerVehicle = new Passenger();
        Vehicle sportsVehicle = new Sports();
        Vehicle offRoadVehicle = new OffRoad();
        passengerVehicle.drive();
        sportsVehicle.drive();
        offRoadVehicle.drive();
    }
}
