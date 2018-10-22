package org.usfirst.frc.team2861.robot.subsystems;

import org.usfirst.frc.team2861.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch_Subsystem extends Subsystem {

    private Talon Winch = new Talon(RobotMap.auxMotorController);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void climb() {
    	Winch.set(1);
    }
    
    public void retract() {
    	Winch.set(-0.5);
    }
    
    public void stop() {
    	Winch.set(0);
    }
}

