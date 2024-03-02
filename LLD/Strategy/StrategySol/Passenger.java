package LLD.Strategy.StrategySol;

import LLD.Strategy.StrategySol.DriveStrategies.NormalStrategy;

public class Passenger extends Vehicle{
    public Passenger(){
        super(new NormalStrategy());
    }
}
