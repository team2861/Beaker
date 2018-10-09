package org.usfirst.frc.team2861.robot.subsystems;

/**
 *
 */

//	Import Needed Libraries
import org.usfirst.frc.team2861.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class DriveTrain extends Subsystem {
	public static DifferentialDrive robotDrive;
	
	public DriveTrain() {
		robotDrive = new DifferentialDrive(RobotMap.leftDrive, RobotMap.rightDrive);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void DriveWithJoysticks() {
		robotDrive.setSafetyEnabled(true);
		robotDrive.tankDrive(RobotMap.leftJoy.getY(), RobotMap.rightJoy.getY());
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

