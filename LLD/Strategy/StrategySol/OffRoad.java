package LLD.Strategy.StrategySol;

import LLD.Strategy.StrategySol.DriveStrategies.DriveStrategy;
import LLD.Strategy.StrategySol.DriveStrategies.SpecialStrategy;

public class OffRoad extends Vehicle{
    public OffRoad(){
        super(new SpecialStrategy());
    }
}
