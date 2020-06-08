package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle{
    private int rocketAmount;
    private String rocketType;
    private String sensorType;
    private String cameraType;
    private final String aircraftName = "Kochav";

    public Kochav(int rocketAmount, String rocketType, String sensorType, String cameraType, String pilotName, Mission mission, int flightHours, boolean status ){
        this.rocketAmount = rocketAmount;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.flightHours = flightHours;
        this.status = status;
    }

    @Override
    public String attack() {
        return (this.pilotName + ": " + aircraftName + "Attacking " + this.mission.additionalInfo + " with:"
                + this.rocketType + "X" + this.rocketAmount);
    }

    @Override
    public void setMission(Mission mission) {
        this.mission = mission;

    }

    @Override
    public int getHoursOfFlightSinceLastRepair() {
        return this.flightHours;
    }

    public String collectIntelligence(){
        return (this.pilotName + ": " + aircraftName + " Collecting Data in "+ this.mission.additionalInfo + " with sensor type:" + this.sensorType);
    }

    public String preformBda(){
        return (this.pilotName + ": " + aircraftName + "taking pictures of " + this.mission.additionalInfo + " with:"
                + this.cameraType);
    }
    public void setHoursOfFlightSinceLastRepair(int hours){
        this.flightHours = hours;
    }
}
