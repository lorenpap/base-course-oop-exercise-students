package AerialVehicles;

import Missions.Mission;

public class F16 extends AerialVehicle implements AerialBdaVehicle, AerialAttackVehicle{
    private String cameraType;
    private int rocketAmount;
    private String rocketType;
    private final String aircraftName = "F16";
    public F16(String cameraType, int rocketAmount, String rocketType, String pilotName, Mission mission, int flightHours, boolean status )
    {
        this.cameraType = cameraType;
        this.rocketAmount = rocketAmount;
        this.rocketType = rocketType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.flightHours = flightHours;
        this.status = status;
    }

    @Override
    public String attack() {
        return (this.pilotName + ": " + aircraftName + " Attacking " + this.mission.additionalInfo + " with: "
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

    @Override
    public void setHoursOfFlightSinceLastRepair(int hours) {
        this.flightHours = flightHours;
    }

    public String preformBda(){
        return (this.pilotName + ": " + aircraftName + " taking pictures of " + this.mission.additionalInfo + " with: "
                + this.cameraType + " camera");
    }

    public void flyTo(){
        System.out.println("Flying to: " + this.mission.coordinates);
    }

    public void land(){
        System.out.println("Landing");
    }
}
