package org.usfirst.frc.team2861.robot.subsystems;

import org.usfirst.frc.team2861.robot.RobotMap;
import org.usfirst.frc.team2861.robot.commands.TankDrive_Command;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveTrain_Subsystem extends Subsystem {

    private RobotDrive m_drive = new RobotDrive(RobotMap.leftMotorController, RobotMap.rightMotorController);

    public void initDefaultCommand() {
       setDefaultCommand(new TankDrive_Command());
    }
    
    public void TankDrive(Joystick leftStick, Joystick rightStick) {
    	m_drive.tankDrive(leftStick.getY(), rightStick.getY());
    }
    
    public void Stop() {
    	m_drive.drive(0, 0);
    }
}

