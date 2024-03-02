package LLD.Strategy.StrategySol;

import LLD.Strategy.StrategySol.DriveStrategies.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
