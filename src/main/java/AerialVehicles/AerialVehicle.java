package AerialVehicles;

import Entities.Coordinates;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    String pilotName;
    Mission mission;
    int flightHours;
    boolean status;

    public void flyTo(){}

    public void land() {}

    public void check() {
    }

    public void repair(){}

    public abstract void setMission(Mission mission);

    public abstract int getHoursOfFlightSinceLastRepair();

    public abstract void setHoursOfFlightSinceLastRepair(int hours);
}
