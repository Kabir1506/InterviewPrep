package LLD.Strategy.StrategySol;

import LLD.Strategy.StrategySol.DriveStrategies.SpecialStrategy;

public class Sports extends Vehicle{
    public Sports(){
        super(new SpecialStrategy());
    }
}
