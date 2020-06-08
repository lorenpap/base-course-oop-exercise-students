package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission{
    public String region;

    private void begin(){
        System.out.println("Beginning Mission!");
    }

    private void cancel(){
        System.out.println("Abort Mission!");
    }

    private  void finish(){
        System.out.println("Finish Mission!");
    }

    public AttackMission(String region, Coordinates coordinates){
        this.region = region;
        this.coordinates = coordinates;
        this.additionalInfo = region;
    }
}
