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

    void flyTo(){
        System.out.println("Flying to: 32.123123, 41.123123");
    }

    void land(){
        System.out.println("Landing");
    }

    public void check(){
    }
    public abstract void setMission(Mission mission);

    public abstract int getHoursOfFlightSinceLastRepair();

    public abstract void setHoursOfFlightSinceLastRepair(int hours);
}
