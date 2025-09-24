package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPRangefinder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RangeFinder extends SubsystemBase{
    private XRPRangefinder range = new XRPRangefinder();

    public double distanceInInches() {
        return range.getDistanceInches();
    }

    public double distanceInMeters() {
        return range.getDistanceMeters();
    }

    private int clock = 0;

    @Override
    public void periodic() {
        clock++;

        if (clock > 25) {
        System.out.println("Range in inches: " + distanceInInches());
        System.out.println("Range in meters: " + distanceInMeters());

        clock = 0;
        }
    }
}
