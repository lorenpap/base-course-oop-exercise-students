package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {
    String objective;

    private void begin(){
        System.out.println("Beginning Mission!");
    }

    private void cancel(){
        System.out.println("Abort Mission!");
    }

    private  void finish(){
        System.out.println("Finish Mission!");
    }

    public BdaMission(String objective , Coordinates coordinates){
        this.objective = objective;
        this.coordinates = coordinates;
        this.additionalInfo = objective;
    }
}
