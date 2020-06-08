package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    String target;

    private void begin(){
        System.out.println("Beginning Mission!");
    }

    private void cancel(){
        System.out.println("Abort Mission!");
    }

    private  void finish(){
        System.out.println("Finish Mission!");
    }

    public IntelligenceMission(String target , Coordinates coordinates){
        this.target = target;
        this.coordinates = coordinates;
        this.additionalInfo = target;
    }
}
