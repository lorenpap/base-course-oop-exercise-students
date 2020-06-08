package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle{
    private boolean status;
    private int flightHours;
    private String pilotName;
    private String rocketType;
    private int rocketAmount;
    private String sensorType;
    private final String aircraftName = "F15";
    private final int permittedFlightHours = 250;
    private Mission mission;

    public F15(String sensorType, int rocketAmount, String rocketType, String pilotName, Mission mission, int flightHours, boolean status ){
        this.sensorType = sensorType;
        this.rocketAmount = rocketAmount;
        this.rocketType = rocketType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.flightHours = flightHours;
        this.status = status;


    }

    public String attack() {
        return (this.pilotName + ": " + aircraftName + " Attacking " + this.mission.additionalInfo + " with: "
                + this.rocketType + "X" + this.rocketAmount);
    }

    public void setMission(Mission mission) {
        this.mission  = mission;
    }

    @Override
    public int getHoursOfFlightSinceLastRepair() {
        return this.flightHours;
    }

    @Override
    public void setHoursOfFlightSinceLastRepair(int hours) {
        this.flightHours = hours;
    }

    public String collectIntelligence() {
        return (this.pilotName + ": " + aircraftName + " Collecting Data in "+ this.mission.additionalInfo + " with sensor type: " + this.sensorType);
    }

    public void flyTo(){
        System.out.println("Flying to: " + this.mission.coordinates);
    }

    public void land(){
        System.out.println("Landing");
    }
}
