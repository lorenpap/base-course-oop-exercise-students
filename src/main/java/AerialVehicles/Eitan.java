package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;

public class Eitan extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle {

    private String rocketType;
    private int rocketAmount;
    private String sensorType;
    private final String aircraftName = "Eitan";
    private final int permittedFlightHours = 150;

    public Eitan(int rocketsAmount, String rocketType, String sensorType, String pilotName, AttackMission mission , int flightHours, boolean status) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.flightHours = flightHours;
        this.status = status;
        this.rocketAmount = rocketsAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {
        return (this.pilotName + ": " + aircraftName+ " Attacking " + this.mission.additionalInfo + " with: "
        + this.rocketType + "X" + this.rocketAmount);
    }

    public void setMission(Mission mission){
        this.mission = mission;
    }

    @Override
    public int getHoursOfFlightSinceLastRepair() {
        return this.flightHours;
    }

    public String collectIntelligence(){
        return (this.pilotName + ": " + aircraftName + " Collecting Data in "+ this.mission.additionalInfo + " with sensor type: " + this.sensorType);
    }

    public void setHoursOfFlightSinceLastRepair(int hours){
        this.flightHours = hours;
    }

    public void repair(){
        this.status= true;
        this.flightHours = 0;
    }

    public void check(){
        if(this.flightHours > this.permittedFlightHours){
            repair();
        }
    }

    public void flyTo(){
        System.out.println("Flying to: " + this.mission.coordinates);
    }

    public void land(){
        System.out.println("Landing");
    }

}
