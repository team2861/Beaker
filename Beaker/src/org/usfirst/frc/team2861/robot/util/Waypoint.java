package org.usfirst.frc.team2861.robot.util;

public class Waypoint {
    public double x, y, angle;
    /**
     * Create a Waypoint (setpoint) for Trajectory Generation
     * @param x         The X position of the waypoint in meters
     * @param y         The Y position of the waypoint in meters
     * @param angle     The exit angle of the waypoint in radians
     */
    public Waypoint(double x, double y, double angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }
}
