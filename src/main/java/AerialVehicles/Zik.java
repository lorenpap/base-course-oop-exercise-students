package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private final String aircraftName = "Zik";
    private String sensorType;
    private String cameraType;

    public Zik(String sensorType, String cameraType, String pilotName, Mission mission, int flightHours, boolean status){
        this.sensorType = sensorType;
        this.cameraType = cameraType;
        this.pilotName = pilotName;
        this.mission = mission;
        this.flightHours = flightHours;
        this.status = status;
    }

    @Override
    public String preformBda() {
        return (this.pilotName + ": " + aircraftName + "taking pictures of " + this.mission.additionalInfo + " with:"
                + this.cameraType);
    }

    @Override
    public String collectIntelligence() {
        return (this.pilotName + ": " + aircraftName + " Collecting Data in "+ this.mission.additionalInfo + " with sensor type:" + this.sensorType);    }

    @Override
    public void setMission(Mission mission) {
        this.mission = mission;
    }

    @Override
    public int getHoursOfFlightSinceLastRepair() {
        return this.flightHours;
    }
    public void setHoursOfFlightSinceLastRepair(int hours){
        this.flightHours = hours;
    };
}
